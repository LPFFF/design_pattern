package com.tw.design.a_create.a_singleton;

/**
 * 枚举
 * <p>
 * 1)这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * <p>
 * 2)这种方式是 Effective Java 作者 Josh Bloch  提倡的方式
 * <p>
 * 3)结论：推荐使用
 */
public enum H_SingletonEnum {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok");
    }
}

class Run8 {
    public static void main(String[] args) {
        System.out.println(H_SingletonEnum.INSTANCE == H_SingletonEnum.INSTANCE);
        H_SingletonEnum.INSTANCE.sayOK();
    }
}