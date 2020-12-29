package com.tw.design.a_create.b_factory.d_method_factory;

import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;
import lombok.AllArgsConstructor;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 21:19
 **/
@AllArgsConstructor
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public Coffee getCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
