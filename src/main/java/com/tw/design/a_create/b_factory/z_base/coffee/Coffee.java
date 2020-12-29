package com.tw.design.a_create.b_factory.z_base.coffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 19:49
 **/
public abstract class Coffee {
    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
