package com.tw.design.b_structure.c_decorator.food;

/**
 * @author: pengfei.lv
 * @create: 2021-01-13 20:01
 **/
public class FriedRice extends FastFood {
    public FriedRice(String dec, int price) {
        super(dec, price);
    }

    public int cost() {
        return super.getPrice();
    }

    public String desc() {
        return super.getDesc();
    }
}
