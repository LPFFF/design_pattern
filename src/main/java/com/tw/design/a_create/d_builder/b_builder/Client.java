package com.tw.design.a_create.d_builder.b_builder;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 21:44
 **/
public class Client {
    public static void main(String[] args) {
        Director moBikeDirector = new Director(new MoBikeBuilder());
        Bike moBike = moBikeDirector.construct();

        System.out.println(moBike.toString());


        System.out.println("------------------------------------");


        Director ofoDirector = new Director(new OfoBikeBuilder());
        Bike ofoBike = ofoDirector.construct();

        System.out.println(ofoBike);


    }
}
