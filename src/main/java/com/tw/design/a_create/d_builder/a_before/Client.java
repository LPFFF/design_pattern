package com.tw.design.a_create.d_builder.a_before;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 21:44
 **/
public class Client {
    public static void main(String[] args) {
        MoBikeBuilder moBikeBuilder = new MoBikeBuilder();

        Bike moBike = moBikeBuilder.build();

        System.out.println(moBike.toString());


        System.out.println("------------------------------------");


        OfoBikeBuilder ofoBikeBuilder = new OfoBikeBuilder();

        Bike ofo = ofoBikeBuilder.build();

        System.out.println(ofo);

    }
}
