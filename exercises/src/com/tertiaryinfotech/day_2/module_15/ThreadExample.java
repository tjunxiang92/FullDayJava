package com.tertiaryinfotech.day_2.module_15;

public class ThreadExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // Without Threading
            new MyThread("Thread " + i).run();
//            // With Threading
//            MyThread thread = new MyThread("Thread " + i);
//            thread.start();
        }
    }
}

class MyThread extends Thread {
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Running: " + name);
    }
}
