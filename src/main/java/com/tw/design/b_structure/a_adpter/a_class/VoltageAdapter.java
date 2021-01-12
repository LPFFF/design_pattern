package com.tw.design.b_structure.a_adpter.a_class;

/**
 * @author: pengfei.lv
 * @create: 2021-01-11 19:47
 **/
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    public int output5V() {
        int srcV = output220V();
        int targetV = srcV / 44;
        return targetV;
    }
}
