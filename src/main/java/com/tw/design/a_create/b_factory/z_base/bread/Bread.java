package com.tw.design.a_create.b_factory.z_base.bread;

public abstract class Bread {

    public abstract String getName();

    public void addWater() {
        System.out.println("加水");
    }

    public void addFlour() {
        System.out.println("加面粉");
    }
}
