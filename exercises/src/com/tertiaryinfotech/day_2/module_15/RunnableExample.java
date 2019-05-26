package com.tertiaryinfotech.day_2.module_15;

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable("Runnable " + 0);
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(runnable);
            t.start();
//            t.interrupt();
        }
    }
}

class MyRunnable implements Runnable {
    String name;
    Integer index = 1;


    MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        Thread.sleep(1000);
        System.out.println("Running: " + name + ", " + Math.random());
        synchronized (index) {
            System.out.println(index++);
        }
    }
}
