package com.tw.design.a_create.c_proto_type.f_deep_demo02;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:27
 **/
@Data
@AllArgsConstructor
public class Student implements Cloneable, Serializable {
    private String name;
    private Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
