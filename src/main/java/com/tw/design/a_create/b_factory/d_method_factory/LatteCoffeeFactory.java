package com.tw.design.a_create.b_factory.d_method_factory;

import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;
import com.tw.design.a_create.b_factory.z_base.coffee.ItalyCoffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 21:09
 **/
public class LatteCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new ItalyCoffee();
    }
}
