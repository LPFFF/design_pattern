package com.tw.design.b_structure;


public class Test extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        int numThrds = Integer.parseInt(args[0]);
        for (int i = 0; i < numThrds; ++i) {
            System.out.println("Starting thread " + i);
            (new Test()).start();
        }
    }
}

