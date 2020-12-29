package com.tw.design.a_create.d_builder.c_builder3;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author: pengfei.lv
 * @create: 2020-12-27 22:12
 **/
@AllArgsConstructor
@ToString
public class A_Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    public static void main(String[] args) {
        //构建Phone对象
        A_Phone phone = new A_Phone("intel", "三星屏幕", "金士顿", "华硕");
        System.out.println(phone.toString());
    }
}
