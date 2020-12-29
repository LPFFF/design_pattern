package com.tw.design.a_create.b_factory.e_abstract_factory;

import com.tw.design.a_create.b_factory.z_base.bread.Bread;
import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 22:06
 **/
public class Client {
    public static void main(String[] args) {
        DessertStore americanDessertStore = new DessertStore(new ItalyDessertFactory());

        Bread bread = americanDessertStore.getBread();
        System.out.println(bread.getName());

        System.out.println("------------------");

        Coffee coffee = americanDessertStore.getCoffee();
        System.out.println(coffee.getName());
    }
}
