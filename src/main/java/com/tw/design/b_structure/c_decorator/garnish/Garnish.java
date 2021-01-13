package com.tw.design.b_structure.c_decorator.garnish;

import com.tw.design.b_structure.c_decorator.food.FastFood;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: pengfei.lv
 * @create: 2021-01-13 20:07
 **/
@Setter
@Getter
public abstract class Garnish extends FastFood {
    private FastFood fastFood;

    public Garnish(String desc, int price, FastFood fastFood) {
        super(desc, price);
        this.fastFood = fastFood;
    }

}
