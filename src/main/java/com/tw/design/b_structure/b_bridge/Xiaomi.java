package com.tw.design.b_structure.b_bridge;

/**
 * @author: pengfei.lv
 * @create: 2021-01-12 20:03
 **/
public class Xiaomi implements Brand {
    public void open() {
        System.out.println("小米手机打开");
    }

    public void close() {
        System.out.println("小米手机关机");
    }

    public void call() {
        System.out.println("小米手机打电话");
    }
}
