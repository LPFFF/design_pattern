package com.tw.design.b_structure.c_decorator.food;

/**
 * @author: pengfei.lv
 * @create: 2021-01-13 20:01
 **/
public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super("炒面", 13);
    }

    public int cost() {
        return super.getPrice();
    }

    public String desc() {
        return super.getDesc();
    }
}
