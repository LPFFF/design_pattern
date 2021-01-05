package com.tw.design.a_create.c_proto_type.a_before;

import lombok.AllArgsConstructor;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:09
 **/
@AllArgsConstructor
public class Citation {
    private String name;

    public void show() {
        System.out.println(this.name + "：获得三好学生");
    }
}
