package com.company;

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        Mythread my1 = new Mythread("线程1");
        Mythread my2 = new Mythread("线程2");
//        public final void setDaemon(boolean on)
//        将此线程标记为daemon线程或用户线程。 当运行的唯一线程都是守护进程线程时，Java虚拟机将退出。
//        线程启动前必须调用此方法。
//
//        参数
//        on - 如果是 true ，将此线程标记为守护线程
        Thread.currentThread().setName("线程3");
//        设置守护线程
        my1.setDaemon(true);
        my2.setDaemon(true);

        my1.start();
        my2.start();
//        线程1和2在线程3结束后，很快也结束了
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
