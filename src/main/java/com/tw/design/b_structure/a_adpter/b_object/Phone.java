package com.tw.design.b_structure.a_adpter.b_object;

import java.io.*;

/**
 * @author: pengfei.lv
 * @create: 2021-01-11 19:41
 **/
public class Phone {
    //充电
    public void charging(Voltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为 5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于 5V, 不能充电~~");
        }
    }
}
