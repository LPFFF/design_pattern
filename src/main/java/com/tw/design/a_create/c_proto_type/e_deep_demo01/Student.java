package com.tw.design.a_create.c_proto_type.e_deep_demo01;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:27
 **/
@Data
@AllArgsConstructor
public class Student implements Cloneable{
    private String name;
    private Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
