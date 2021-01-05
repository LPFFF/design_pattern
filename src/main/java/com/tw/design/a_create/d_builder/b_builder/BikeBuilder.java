package com.tw.design.a_create.d_builder.b_builder;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 21:44
 **/
public abstract class BikeBuilder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSaddle();

    public abstract Bike create();
}
