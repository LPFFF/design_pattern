package com.tw.design.a_create.c_proto_type.b_shallow;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:09
 **/
@Data
@AllArgsConstructor
public class Citation implements Cloneable {
    private String name;
    private Integer age;

    public void show() {
        System.out.println(this.name + "：获得三好学生");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
