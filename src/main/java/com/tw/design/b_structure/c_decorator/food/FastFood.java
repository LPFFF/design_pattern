package com.tw.design.b_structure.c_decorator.food;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: pengfei.lv
 * @create: 2021-01-13 19:57
 **/
@Getter
@Setter
@AllArgsConstructor
public abstract class FastFood {
    private String desc;
    private int price;

    public abstract int cost();

    public abstract String desc();
}
