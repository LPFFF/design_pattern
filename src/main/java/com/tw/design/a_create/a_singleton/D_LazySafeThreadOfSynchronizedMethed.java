package com.tw.design.a_create.a_singleton;

/**
 * 懒汉式(线程安全，同步方法)
 * <p>
 * 1)解决了线程安全问题
 * <p>
 * 2)效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，
 * 后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 * <p>
 * 3)结论：在实际开发中，不推荐使用这种方式
 *
 * @author: pengfei.lv
 * @create: 2020-12-18 20:40
 **/
public class D_LazySafeThreadOfSynchronizedMethed {
    private static D_LazySafeThreadOfSynchronizedMethed instance;

    private D_LazySafeThreadOfSynchronizedMethed() {
    }

    public static synchronized D_LazySafeThreadOfSynchronizedMethed getInstance() {
        if (null == instance) {
            instance = new D_LazySafeThreadOfSynchronizedMethed();
        }
        return instance;
    }
}

class Run4 {
    public static void main(String[] args) {
        System.out.println(D_LazySafeThreadOfSynchronizedMethed.getInstance() == D_LazySafeThreadOfSynchronizedMethed.getInstance());
    }
}
