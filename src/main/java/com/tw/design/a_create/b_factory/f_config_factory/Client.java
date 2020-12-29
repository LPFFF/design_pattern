package com.tw.design.a_create.b_factory.f_config_factory;

import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 19:58
 **/
public class Client {
    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore();

        Coffee coffee = coffeeStore.getCoffee("American");

        System.out.println(coffee.getName());
    }
}
