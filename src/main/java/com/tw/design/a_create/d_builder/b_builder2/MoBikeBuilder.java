package com.tw.design.a_create.d_builder.b_builder2;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 21:53
 **/
public class MoBikeBuilder extends BikeBuilder {
    public void buildFrame() {
        this.bike.setFrame("MoBike 车架");
        System.out.println("安上一个   MoBike   的车架");
    }

    public void buildSaddle() {
        this.bike.setSaddle("MoBike 车座");
        System.out.println("安上一个   MoBike   的车座");
    }
}
