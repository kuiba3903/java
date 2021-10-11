package com.company.多线程;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        无参构造方法
//        Mythread my  =new Mythread();
//        Mythread my2 = new Mythread();
//        没有调用多线程
//        my2.run();
//        my.run();
//        public void start()
//        导致此线程开始执行; Java虚拟机调用此线程的run方法。
//        public final void setName(String name)将此线程的名称更改为等于参数name 。
//        my.setName("线程1");
//        my2.setName("线程2");

//        带参构造方法,继承的子类也需要实现带参构造
        Mythread my = new Mythread("线程1");
        Mythread my2 = new Mythread("线程2");

        my.start();
        my2.start();
//       public static Thread currentThread()返回对当前正在执行的线程对象的引用。
//       这是一个静态方法,直接用类调用方法
        System.out.println(Thread.currentThread().getName());

    }
}
