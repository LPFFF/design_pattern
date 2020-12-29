package com.tw.design.a_create.b_factory.e_abstract_factory;

import com.tw.design.a_create.b_factory.z_base.bread.AmericanBread;
import com.tw.design.a_create.b_factory.z_base.bread.Bread;
import com.tw.design.a_create.b_factory.z_base.coffee.AmericanCoffee;
import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 22:00
 **/
public class AmericanDessertFactory implements DessertFactory{
    public Bread getBread() {
        return new AmericanBread();
    }

    public Coffee getCoffee() {
        return new AmericanCoffee();
    }
}
