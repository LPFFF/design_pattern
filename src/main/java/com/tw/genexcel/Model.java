package com.tw.genexcel;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/**
 * @author: pengfei.lv
 * @create: 2022-01-20 00:05
 **/
@AllArgsConstructor
@Getter
public class Model {
    private String table;

    private List<String> source;

    private String sql;

    private String type;

    @Override
    public String toString() {
        return "Model{" +
                "table='" + table + '\'' +
                ", source=" + source +
                ", sql='" + sql + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getSource() {
        StringBuffer stringBuffer = new StringBuffer();
        for(String str: source){
            stringBuffer.append(str);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
