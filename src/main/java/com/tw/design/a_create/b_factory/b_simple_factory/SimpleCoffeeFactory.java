package com.tw.design.a_create.b_factory.b_simple_factory;

import com.tw.design.a_create.b_factory.z_base.coffee.AmericanCoffee;
import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;
import com.tw.design.a_create.b_factory.z_base.coffee.ItalyCoffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 20:30
 **/
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee;
        if ("American".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("Italy".equals(type)) {
            coffee = new ItalyCoffee();
        } else {
            throw new RuntimeException("没有此类咖啡");
        }
        return coffee;
    }
}
