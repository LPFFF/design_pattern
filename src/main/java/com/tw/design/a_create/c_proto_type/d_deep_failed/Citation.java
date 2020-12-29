package com.tw.design.a_create.c_proto_type.d_deep_failed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:09
 **/
@AllArgsConstructor
@Data
public class Citation implements Cloneable {
    private Student student;

    public void show() {
        System.out.println(student.getName() + "：获得三好学生");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
