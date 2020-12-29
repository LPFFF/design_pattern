package com.tw.design.a_create.a_singleton;

/**
 * 静态内部类
 * <p>
 * 1)这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * <p>
 * 2)静态内部类方式在 Singleton 类被装载时并不会立即实例化，而是在需要实例化时，调用 getInstance 方法，才会装载 SingletonInstance 类，从而完成 Singleton 的实例化。
 * <p>
 * 3)类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM 帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * <p>
 * 4)优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * <p>
 * 5)结论：推荐使用.
 *
 * @author: pengfei.lv
 * @create: 2020-12-18 21:08
 **/
public class G_StaticInnerClass {

    private G_StaticInnerClass() {
    }

    public static class StaticInnerClassInstance {
        public static G_StaticInnerClass INSTANCE = new G_StaticInnerClass();
    }
}

class Run7 {
    public static void main(String[] args) {
        System.out.println(G_StaticInnerClass.StaticInnerClassInstance.INSTANCE == G_StaticInnerClass.StaticInnerClassInstance.INSTANCE);
    }
}