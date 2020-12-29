package com.tw.design.a_create.b_factory.e_abstract_factory;

import com.tw.design.a_create.b_factory.z_base.bread.Bread;
import com.tw.design.a_create.b_factory.z_base.bread.ItalyBread;
import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;
import com.tw.design.a_create.b_factory.z_base.coffee.ItalyCoffee;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 22:00
 **/
public class ItalyDessertFactory implements DessertFactory {
    public Bread getBread() {
        return new ItalyBread();
    }

    public Coffee getCoffee() {
        return new ItalyCoffee();
    }
}
