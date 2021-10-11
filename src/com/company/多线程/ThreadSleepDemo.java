package com.company.多线程;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep my1 = new ThreadSleep("线程1");
        ThreadSleep my2 = new ThreadSleep("线程2");
        ThreadSleep my3 = new ThreadSleep("线程3");
        my1.start();
        my2.start();
        my3.start();


    }
}
