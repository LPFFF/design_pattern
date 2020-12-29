package com.tw.design.a_create.c_proto_type.e_deep_demo01;

import lombok.AllArgsConstructor;
import lombok.Data;

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

        Citation citation = (Citation) super.clone();

        citation.student = (Student) citation.student.clone();

        return citation;
    }
}
