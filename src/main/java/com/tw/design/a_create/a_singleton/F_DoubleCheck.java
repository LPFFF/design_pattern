package com.tw.design.a_create.a_singleton;

/**
 * 双重检查
 * <p>
 * volatile 能让我们修改立即同步到对象
 * 1)Double-Check 概念是多线程开发中常使用到的，如代码中所示，我们进行了两次 if (singleton == null)检查，这样就可以保证线程安全了。
 * <p>
 * 2)这样，实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)，直接 return 实例化对象，也避免的反复进行方法同步.
 * <p>
 * 3)线程安全；延迟加载；效率较高
 * <p>
 * 4)结论：在实际开发中，推荐使用这种单例设计模式
 *
 * @author: pengfei.lv
 * @create: 2020-12-18 20:59
 **/
public class F_DoubleCheck {
    private static volatile F_DoubleCheck instance;

    private F_DoubleCheck() {
    }

    public static F_DoubleCheck getInstance() {
        if (null == instance) {
            synchronized (F_DoubleCheck.class) {
                if (null == instance) {
                    instance = new F_DoubleCheck();
                }
            }
        }
        return instance;
    }
}
