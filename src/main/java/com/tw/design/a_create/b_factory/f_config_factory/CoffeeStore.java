package com.tw.design.a_create.b_factory.f_config_factory;

import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;

/**
 * @author: pengfei.lv77
 * @create: 2020-12-24 19:56
 **/
public class CoffeeStore {

    public Coffee getCoffee(String type) {

        Coffee coffee = PropertiesCoffeeFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
