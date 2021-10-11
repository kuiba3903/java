package com.company.多线程;

public class ThreadSleep extends Thread {
    public ThreadSleep() {
    }

    public ThreadSleep(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + ":" + i);
//            public static void sleep(long millis)
//                  throws InterruptedException
//                  使当前正在执行的线程停留（暂停执行）指定的毫秒数，
//                  这取决于系统定时器和调度程序的精度和准确性。 线程不会丢失任何显示器的所有权。
            try {
//                每执行一次，睡眠1秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
