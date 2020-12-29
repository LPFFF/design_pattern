package com.tw.design.a_create.b_factory.b_simple_factory;

import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 19:56
 **/
public class CoffeeStore {
    public Coffee getCoffee(String type) {

        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();

        Coffee coffee = simpleCoffeeFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
