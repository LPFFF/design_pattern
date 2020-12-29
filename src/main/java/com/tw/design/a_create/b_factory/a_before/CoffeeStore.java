package com.tw.design.a_create.b_factory.a_before;

import com.tw.design.a_create.b_factory.z_base.coffee.AmericanCoffee;
import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;
import com.tw.design.a_create.b_factory.z_base.coffee.ItalyCoffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 19:56
 **/
public class CoffeeStore {
    public Coffee getCoffee(String type) {
        Coffee coffee;
        if ("American".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("Italy".equals(type)) {
            coffee = new ItalyCoffee();
        } else {
            throw new RuntimeException("没有此类咖啡");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
