package com.company;
// 实现多线程的方式2：
//        1.定义一个MyRunable类实现Runable接口
//        2.在MyRunable类中重写run()方法
//        3.创建MyRunable类的对象
//        4.创建Thread类的对象,将MyRunable对象作为构造方法的参数传入
//        5.启动线程

public class MyRunableDemo {
    public static void main(String[] args) {
        MyRunable my = new MyRunable();
//        无参构造
//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);

//        带参构造
        Thread t1 = new Thread(my, "线程1");
        Thread t2 = new Thread(my, "线程2");
        t1.start();
        t2.start();

    }
}
