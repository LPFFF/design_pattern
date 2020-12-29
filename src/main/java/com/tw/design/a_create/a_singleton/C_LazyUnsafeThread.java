package com.tw.design.a_create.a_singleton;

/**
 * 懒汉式(线程不安全)
 * <p>
 * 1)起到了 Lazy Loading 的效果，但是只能在单线程下使用。
 * <p>
 * 2)如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 * 所以在多线程环境下不可使用这种方式
 * <p>
 * 3)结论：在实际开发中，不要使用这种方式.
 *
 * @author: pengfei.lv
 * @create: 2020-12-18 20:33
 **/
public class C_LazyUnsafeThread {
    private static C_LazyUnsafeThread instance;

    private C_LazyUnsafeThread() {
    }

    public static C_LazyUnsafeThread getInstance() {
        if (null == instance) {
            instance = new C_LazyUnsafeThread();
        }
        return instance;
    }
}

class Run3 {
    public static void main(String[] args) {
        System.out.println(C_LazyUnsafeThread.getInstance() == C_LazyUnsafeThread.getInstance());
    }
}