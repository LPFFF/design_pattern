package com.tw.design.a_create.c_proto_type.d_deep_failed;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:26
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation1 = new Citation(new Student("张一", 11));

        Citation citation2 = (Citation)citation1.clone();
        citation2.getStudent().setName("李四");

        citation1.show();
        citation2.show();

        System.out.println(citation1.getStudent()==citation2.getStudent());
    }
}
