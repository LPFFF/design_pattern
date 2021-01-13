package com.tw.design.b_structure.c_decorator;

import com.tw.design.b_structure.c_decorator.food.FastFood;
import com.tw.design.b_structure.c_decorator.food.FriedRice;
import com.tw.design.b_structure.c_decorator.garnish.Bacon;
import com.tw.design.b_structure.c_decorator.garnish.Egg;

/**
 * @author: pengfei.lv
 * @create: 2021-01-13 20:12
 **/
public class Client {
    public static void main(String[] args) {
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.desc() + "  :  " + friedRice.cost());


        System.out.println("====================================");

        FastFood friedRiceAndEgg = new Egg(friedRice);
        System.out.println(friedRiceAndEgg.desc() + "  :  " + friedRiceAndEgg.cost());


        System.out.println("====================================");

        FastFood friedRiceAndEggAndBacon = new Bacon(friedRiceAndEgg);
        System.out.println(friedRiceAndEggAndBacon.desc() + "  :  " + friedRiceAndEggAndBacon.cost());


        System.out.println("====================================");

        FastFood friedRiceAndEggAndBaconAddEgg = new Egg(friedRiceAndEggAndBacon);
        System.out.println(friedRiceAndEggAndBaconAddEgg.desc() + "  :  " + friedRiceAndEggAndBaconAddEgg.cost());
    }
}
