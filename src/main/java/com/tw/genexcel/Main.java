package com.tw.genexcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: pengfei.lv
 * @create: 2022-01-20 00:10
 * 数据血缘生产
 **/
public class Main {
    public static File file = null;

    public static void main(String[] args) throws IOException {
        List<String> inputTableNames = new ArrayList<String>(Arrays.asList(
                "dm.dm_aftersales_check_in_time_and_order_number",
                "dm.dm_aftersales_check_out_time_and_order_number",
                "dm.dm_aftersales_clocked_off_statistics_non_invoice",
                "dm.dm_aftersales_customer_requirement",
                "dm.dm_aftersales_indicator_invoice_line_item",
                "dm.dm_aftersales_indicator_service_record_latest_record",
                "dm.dm_aftersales_invoice_checked_out_and_checked_in_time",
                "dm.dm_aftersales_invoice_price",
                "dm.dm_aftersales_invoice_sum_price_and_count_by_date",
                "dm.dm_aftersales_labor_amount_before_tax",
                "dm.dm_aftersales_non_completion_checkout_count",
                "dm.dm_aftersales_order_number_and_damage_code",
                "dm.dm_aftersales_order_unpaid_line_item_count",
                "dm.dm_aftersales_part_amount_before_tax",
                "dm.dm_aftersales_price_by_invoice_id_customer_type_number",
                "dm.dm_aftersales_record_check_in",
                "dm.dm_aftersales_record_check_out",
                "dm.dm_aftersales_record_clocked_out",
                "dm.dm_aftersales_sundry_amount_before_tax",
                "dm.dm_aftersales_unpaid_amount",
                "dm.dm_aftersales_unpaid_amount_labor",
                "dm.dm_aftersales_unpaid_amount_sundry",
                "dm.dm_aftersales_unpaid_reserved_part",
                "dm.dm_aftersales_unpaid_stock_out_part",
                "dm.dm_aftersales_unpaid_sum_amount_part",
                "dm.dm_aftersales_vat_tax_amount",
                "dm.dw_aftersales_vehicle_dealer_latest_checked_in_time",
                "dm.dw_dm_aftersales_final_inspection_end",
                "dm.dw_dm_aftersales_invoiced_time",
                "dm.dw_dm_aftersales_labor_amount_claim",
                "dm.dw_dm_aftersales_labor_amount_internal",
                "dm.dw_dm_aftersales_labor_amount_retail",
                "dm.dw_dm_aftersales_line_item_contribution_status_price",
                "dm.dw_dm_aftersales_line_item_customer_type_price",
                "dm.dw_dm_aftersales_line_item_invoiced_status",
                "dm.dw_dm_aftersales_order_is_all_unpaid",
                "dm.dw_dm_aftersales_order_latest_invoiced_date",
                "dm.dw_dm_aftersales_otc_part_sales_amount",
                "dm.dw_dm_aftersales_otc_part_sales_vat_amount",
                "dm.dw_dm_aftersales_outsourced_labor_amount_internal",
                "dm.dw_dm_aftersales_outsourced_labor_amount_retail",
                "dm.dw_dm_aftersales_part_amount_claim",
                "dm.dw_dm_aftersales_part_amount_internal",
                "dm.dw_dm_aftersales_part_amount_retail",
                "dm.dw_dm_aftersales_record_check_in",
                "dm.dw_dm_aftersales_record_check_out",
                "dm.dw_dm_aftersales_reporting_non_checked_in_vehicle_statistics",
                "dm.dw_dm_aftersales_rwo_vat_amount",
                "dm.dw_dm_aftersales_service_record_clocked_off_date",
                "dm.dw_dm_aftersales_sundry_amount_claim",
                "dm.dw_dm_aftersales_sundry_amount_internal",
                "dm.dw_dm_aftersales_sundry_amount_retail",
                "dm.dw_dm_aftersales_vehicle_dealer_latest_checked_in_time",
                "application1.dm_aftersales_inspection_items_check_rate",
                "application1.dm_aftersales_invoice_service_type_mapping",
                "application1.dm_aftersales_reporting_t1_completion_rate",
                "application1.dm_aftersales_vehicle_pwei_track_report",
                "application1.dm_service_record_rpd_query_record",
                "application1.dw_aftersales_fact_invoice_line_item_to_pg",
                "application1.dw_aftersales_fact_line_item_contribution_to_pg",
                "application1.dw_aftersales_fact_order_line_item_to_pg",
                "application1.dw_labour_item_technician_status_history_daily_segment",
                "application2.dm_aftersales_checked_in_car_statistics",
                "application2.dm_aftersales_clocked_off_statistics",
                "application2.dm_aftersales_lost_sale_report",
                "application2.dm_aftersales_monthly_operating_statistics",
                "application2.dm_aftersales_non_checked_in_vehicle_statistics",
                "application2.dm_aftersales_order_general_query",
                "application2.dm_aftersales_repair_sales_record_general_query",
                "application2.dm_aftersales_reporting_monthly_revenue_statistics_part_sales_amount",
                "application2.dm_aftersales_reporting_monthly_revenue_statistics_without_part_sales_amount",
                "application2.dm_aftersales_reporting_parts_reservation",
                "application2.dm_aftersales_reporting_service_measure_status_query",
                "application2.dm_aftersales_wait_for_payment_order",
                "application2.dm_aftersales_warranty_order_status_query"
        ));

        List<Model> models = genModels(inputTableNames);
        System.out.println(models.toString());
        writeExcel(models);
    }

    private static List<Model> genModels(List<String> inputTableNames) throws IOException {
        List<Model> models = new ArrayList<Model>();
        Collections.sort(inputTableNames);
        for (String table : inputTableNames) {
            String sql = table.split("[.]")[1] + ".sql";
            List<String> source = new ArrayList<String>();
            String type = "Full";
//            找到对应文件
            file = null;
            findFile("/Users/freeman/Desktop/project/works/daimler/otr-report-bigdata/tasks", sql);
            if (file == null) {
                type = "不知道";
            } else {
//            读取内容
                InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
                BufferedReader br = new BufferedReader(reader);
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("${START_TIME}") || line.contains("${END_TIME}")) {
                        type = "Increment";
                    }
                    String pattern = "(?!=)\\W(ods[.]|dim[.]|dwd[.]|dws[.]|dm[.]|public[.])\\w*";
                    // 创建 Pattern 对象
                    Pattern r = Pattern.compile(pattern);
                    // 现在创建 matcher 对象
                    Matcher m = r.matcher(line);
                    while (m.find()) {
                        source.add(m.group());
                    }
                }
                reader.close();
                br.close();
            }
            Set<String> tempSet = new HashSet<String>(source);
            List<String> tempList = new ArrayList<String>(tempSet);
            Collections.sort(tempList);
            models.add(new Model(table, tempList, sql, type));
        }

        return models;
    }

    private static void writeExcel(List<Model> models) throws IOException {
        //        a. 创建一个工作簿workbook
        Workbook workbook = new HSSFWorkbook();
//        b. 创建一个工作表sheet
        Sheet sheet = workbook.createSheet();
        sheet.setColumnWidth(0, 70*256);
        sheet.setColumnWidth(1, 70*256);
        sheet.setColumnWidth(2, 70*256);
        sheet.setColumnWidth(3, 20*256);


        //        c. 创建一个行对象row（下标起始值为0），这里是第4行
        Row headRow = sheet.createRow(0);
        //        d. 创建一个单元格对象cell（下标起始值为0），这里是第四列
        Cell headTable = headRow.createCell(0);
        Cell HeadSource = headRow.createCell(1);
        Cell headSql = headRow.createCell(2);
        Cell HeadType = headRow.createCell(3);

        //        e. 设置单元格的内容
        headTable.setCellValue("table");
        HeadSource.setCellValue("source");
        headSql.setCellValue("sql");
        HeadType.setCellValue("type");

        for (int i = 0; i < models.size(); i++) {
            Model model = models.get(i);

            Row row = sheet.createRow(i+1);

            Cell table = row.createCell(0);
            Cell source = row.createCell(1);
            Cell sql = row.createCell(2);
            Cell type = row.createCell(3);

            table.setCellValue(model.getTable());
            source.setCellValue(model.getSource());
            sql.setCellValue(model.getSql());
            type.setCellValue(model.getType());
        }

//        g. 保存，关闭流对象，在D盘生成excel测试.xls文件
        OutputStream os = new FileOutputStream("/Users/freeman/Downloads/dm.xls");
        workbook.write(os);
        os.close();
    }

    /**
     * 递归查找文件
     *
     * @param baseDirName    查找的文件夹路径
     * @param targetFileName 需要查找的文件名
     */
    public static void findFile(String baseDirName, String targetFileName) {
        File baseDir = new File(baseDirName);        // 创建一个File对象
        //判断目录是否存在
        File[] files = baseDir.listFiles();
        for (File tempFile : files) {
            if (tempFile.isDirectory()) {
                findFile(tempFile.getAbsolutePath(), targetFileName);
            } else if (tempFile.isFile()) {
                if (tempFile.getName().equals(targetFileName)) {
                    file = tempFile;
                }
            }
        }
    }
}
