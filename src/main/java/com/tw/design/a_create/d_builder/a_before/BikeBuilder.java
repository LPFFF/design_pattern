package com.tw.design.a_create.d_builder.a_before;

import lombok.Data;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 21:44
 **/
@Data
public abstract class BikeBuilder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSaddle();

    public Bike build() {
        this.buildFrame();
        this.buildSaddle();
        return bike;
    }
}
