package com.tw.design.b_structure.a_adpter.b_object;

import lombok.AllArgsConstructor;

/**
 * @author: pengfei.lv
 * @create: 2021-01-11 19:47
 **/
@AllArgsConstructor
public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public int output5V() {
        int srcV = voltage220V.output220V();
        int targetV = srcV / 44;
        return targetV;
    }
}
