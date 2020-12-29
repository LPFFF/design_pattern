package com.tw.design.a_create.b_factory.e_abstract_factory;

import com.tw.design.a_create.b_factory.z_base.bread.Bread;
import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;
import lombok.AllArgsConstructor;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 22:04
 **/
@AllArgsConstructor
public class DessertStore {
    private DessertFactory dessertFactory;

    public Coffee getCoffee() {
        Coffee coffee = dessertFactory.getCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    public Bread getBread() {
        Bread bread = dessertFactory.getBread();
        bread.addFlour();
        bread.addWater();
        return bread;
    }
}
