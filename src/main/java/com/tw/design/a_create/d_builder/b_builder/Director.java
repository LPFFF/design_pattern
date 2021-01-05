package com.tw.design.a_create.d_builder.b_builder;

import lombok.AllArgsConstructor;

/**
 * @author: pengfei.lv
 * @create: 2020-12-27 19:21
 **/
@AllArgsConstructor
public class Director {
    private BikeBuilder builder;

    public Bike construct() {
        this.builder.buildFrame();
        this.builder.buildSaddle();
        return this.builder.create();
    }
}
