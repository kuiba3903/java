package com.company;

public class SellTickets implements Runnable {
    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
//            同步代码块
//            synchronized(obj)
//            同步方法 锁对象是this
//            synchronized (this)
//            同步静态方法的锁对象是 类名.class
//            synchronized (SellTickets.class)
                synchronized (SellTickets.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {
                sell_static();
            }
            x++;
        }
    }

    public synchronized void sell() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
            tickets--;
        }
    }

    public static synchronized void sell_static() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
            tickets--;
        }
    }
}
