package com.company;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        Mythread my1 = new Mythread("线程1");
        Mythread my2 = new Mythread("线程2");
        Mythread my3 = new Mythread("线程3");
        my3.start();
//        public final void join()
//                throws InterruptedException
//                等待这个线程死亡。
//        只有线程3结束,线程1和2才能抢夺CPU
        try {
            my3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        my1.start();
        my2.start();

    }
}
