package com.tw.design.a_create.c_proto_type.b_shallow;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:10
 **/
public class Client {
    public static void main(String[] args) throws Exception {

        Citation citation1 = new Citation("张一",11);

        Citation citation2 = (Citation) citation1.clone();
        citation2.setName("李四");

        citation1.show();
        citation2.show();
    }
}
