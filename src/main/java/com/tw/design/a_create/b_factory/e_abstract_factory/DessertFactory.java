package com.tw.design.a_create.b_factory.e_abstract_factory;

import com.tw.design.a_create.b_factory.z_base.bread.Bread;
import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;

public interface DessertFactory {

    Bread getBread();

    Coffee getCoffee();
}
