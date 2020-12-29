package com.tw.design.a_create.c_proto_type.f_deep_demo02;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 20:09
 **/
@AllArgsConstructor
@Data
public class Citation implements Cloneable, Serializable {
    private Student student;

    public void show() {
        System.out.println(student.getName() + "：获得三好学生");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Citation citation = (Citation) ois.readObject();

            return citation;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
