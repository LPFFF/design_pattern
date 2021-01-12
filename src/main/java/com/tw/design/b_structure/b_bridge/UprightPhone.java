package com.tw.design.b_structure.b_bridge;

/**
 * @author: pengfei.lv
 * @create: 2021-01-12 19:59
 **/
public class UprightPhone extends Phone {
    public UprightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("直板手机");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("直板手机");
        super.close();
    }

    @Override
    public void call() {
        System.out.println("直板手机");
        super.call();
    }
}
