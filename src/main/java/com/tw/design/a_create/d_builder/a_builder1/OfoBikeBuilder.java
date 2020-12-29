package com.tw.design.a_create.d_builder.a_builder1;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 21:52
 **/
public class OfoBikeBuilder extends BikeBuilder {
    public void buildFrame() {
        this.bike.setFrame("ofo 车架");
        System.out.println("安上一个   ofo   的车架");
    }

    public void buildSaddle() {
        this.bike.setSaddle("ofo 车座");
        System.out.println("安上一个   ofo   的车座");
    }

    public Bike create() {
        return bike;
    }
}
