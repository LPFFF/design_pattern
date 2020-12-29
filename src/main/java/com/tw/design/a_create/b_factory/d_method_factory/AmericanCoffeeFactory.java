package com.tw.design.a_create.b_factory.d_method_factory;

import com.tw.design.a_create.b_factory.z_base.coffee.AmericanCoffee;
import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 21:09
 **/
public class AmericanCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
