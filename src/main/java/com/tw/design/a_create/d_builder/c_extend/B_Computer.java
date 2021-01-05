package com.tw.design.a_create.d_builder.c_extend;

import lombok.ToString;

/**
 * @author: pengfei.lv
 * @create: 2020-12-27 22:15
 **/
@ToString
public class B_Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    public B_Computer() {
    }

    private B_Computer(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainBoard = builder.mainBoard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

        public Builder() {
        }

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder screen(String val) {
            screen = val;
            return this;
        }

        public Builder memory(String val) {
            memory = val;
            return this;
        }

        public Builder mainBoard(String val) {
            mainBoard = val;
            return this;
        }

        public B_Computer build() {
            return new B_Computer(this);
        }
    }

    public static void main(String[] args) {
        B_Computer computer = new Builder()
                .cpu("intel")
                .mainBoard("华硕")
                .memory("金士顿")
                .screen("三星").build();
        System.out.println(computer);
    }
}
