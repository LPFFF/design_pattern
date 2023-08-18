package com.tw.design;

import lombok.Builder;

import java.io.*;

/**
 * @author: pengfei.lv
 * @create: 2020-12-25 18:20
 **/
@Builder
public class Test {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(""));
        a.a();
        b.a();

    }

    private static class a{
        public static void a(){
            System.out.println("a");
        }
    }
    private static class b extends a{
        public static void a(){
            System.out.println("b");
        }
    }
}
