package com.tw.design.a_create.c_proto_type.a_before;

import lombok.AllArgsConstructor;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:09
 **/
@AllArgsConstructor
public class Citation {
    private String name;
    private Integer age;

    public void show() {
        System.out.println(this.age + "岁的" + this.name + "：获得三好学生");
    }
}
