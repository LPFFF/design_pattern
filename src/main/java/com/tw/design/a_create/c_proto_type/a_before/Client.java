package com.tw.design.a_create.c_proto_type.a_before;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:10
 **/
public class Client {
    public static void main(String[] args) {

        Citation citation1 = new Citation("张一",11);
        citation1.show();

        Citation citation2 = new Citation("张二",22);
        citation2.show();

        Citation citation3 = new Citation("张三",33);
        citation3.show();

        Citation citation4 = new Citation("张三",44);
        citation4.show();
    }
}
