package com.tw.design.b_structure.b_bridge;

import lombok.AllArgsConstructor;

/**
 * @author: pengfei.lv
 * @create: 2021-01-12 19:54
 **/
@AllArgsConstructor
public abstract class Phone {
    private Brand brand;

    public void open() {
        this.brand.open();
    }

    public void close() {
        this.brand.close();
    }

    public void call() {
        this.brand.call();
    }
}
