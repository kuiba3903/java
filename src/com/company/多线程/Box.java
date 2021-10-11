package com.company.多线程;

public class Box {
    private int milk;
    private boolean state = false;//表示牛奶的状态

    //  放入牛奶的操作
//     synchronized 同步关键字
    public synchronized void put(int milk) {
        if (state) {//有牛奶，就不生产
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工将" + this.milk + "瓶奶放入奶箱");
        state = true;
        notifyAll();
    }

    //    取牛奶的操作
    public synchronized void get() {
        if (!state) {//没有牛奶，等待生产
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第" + this.milk + "瓶牛奶");
        state = false;
        notifyAll();
    }
}
