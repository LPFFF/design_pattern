package com.tw.design.b_structure.c_decorator.food;

/**
 * @author: pengfei.lv
 * @create: 2021-01-13 20:01
 **/
public class FriedRice extends FastFood {
    public FriedRice() {
        super("炒饭", 10);
    }

    public int cost() {
        return super.getPrice();
    }

    public String desc() {
        return super.getDesc();
    }
}
