package com.tw.design.b_structure.b_bridge;

/**
 * @author: pengfei.lv
 * @create: 2021-01-12 20:04
 **/
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Xiaomi());
        phone.open();
        phone.call();
        phone.call();
    }
}
