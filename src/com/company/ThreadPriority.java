package com.company;

public class ThreadPriority {
    public static void main(String[] args) {
        Mythread my1 = new Mythread();
        Mythread my2 = new Mythread();
        Mythread my3 = new Mythread();

        my1.setName("线程1");
        my2.setName("线程2");
        my3.setName("线程3");


//        public final int getPriority()返回此线程的优先级。
//        System.out.println(my1.getPriority());
//        System.out.println(my2.getPriority());
//        System.out.println(my3.getPriority());

//        public final void setPriority(int newPriority)更改此线程的优先级?
//        输出线程默认的优先级和可以设置优先级的范围
//        System.out.println(Thread.NORM_PRIORITY);
//        System.out.println(Thread.MAX_PRIORITY);
//        System.out.println(Thread.MIN_PRIORITY);

//      设置线程的优先级
        my1.setPriority(1);
        my2.setPriority(5);
        my3.setPriority(10);


        my1.start();
        my2.start();
        my3.start();
    }
}
