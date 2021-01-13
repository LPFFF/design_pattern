package com.tw.design.b_structure.c_decorator.garnish;

import com.tw.design.b_structure.c_decorator.food.FastFood;

/**
 * @author: pengfei.lv
 * @create: 2021-01-13 20:10
 **/
public class Bacon extends Garnish {
    public Bacon(String desc, int price, FastFood fastFood) {
        super(desc, price, fastFood);
    }

    public int cost() {
        return this.getPrice() + super.getFastFood().cost();
    }

    public String desc() {
        return this.getDesc() + super.getFastFood().desc();
    }
}
