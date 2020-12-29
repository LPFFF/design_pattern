package com.tw.design;

import lombok.Builder;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 18:20
 **/
@Builder
public class Test {
    public static void main(String[] args) {
        a.a();
        b.a();

    }

    private static class a{
        public static void a(){
            System.out.println("a");
        }
    }
    private static class b extends a{
        public static void a(){
            System.out.println("b");
        }
    }
}
