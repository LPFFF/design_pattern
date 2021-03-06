package com.tw.design.b_structure.a_adpter.b_object;

/**
 * 1)对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。
 * 根据合成复用原则，使用组合替代继承， 所以它解决了类适配器必须继承 src 的局限性问题
 * <p>
 * 2)使用成本更低，更灵活。
 *
 * @author: pengfei.lv
 * @create: 2021-01-11 19:47
 **/
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}