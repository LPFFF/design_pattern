package com.tw.design.a_create.a_singleton;

/**
 * 懒汉式(线程可能安全，同步代码块)
 *
 * <p>
 * 不推荐使用
 *
 * @author: pengfei.lv
 * @create: 2020-12-18 20:44
 **/
public class E_LazyUnsafeThreadOfSynchronizedCodeBlock {
    private static E_LazyUnsafeThreadOfSynchronizedCodeBlock instance;

    private E_LazyUnsafeThreadOfSynchronizedCodeBlock() {
    }

    public static E_LazyUnsafeThreadOfSynchronizedCodeBlock getInstance() {
        if (null == instance) {
            synchronized (E_LazyUnsafeThreadOfSynchronizedCodeBlock.class){
                instance = new E_LazyUnsafeThreadOfSynchronizedCodeBlock();
            }
        }
        return instance;
    }
}
