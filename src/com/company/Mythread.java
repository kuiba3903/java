package com.company;


public class Mythread extends Thread {
    Mythread() {
    }

    Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //public final String getName()
        // 返回此线程的名称。
        System.out.println("开始");
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + ":" + i);
        }
        System.out.println("结束");
    }
}

