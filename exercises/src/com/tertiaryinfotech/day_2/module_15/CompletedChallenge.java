package com.tertiaryinfotech.day_2.module_15;

public class CompletedChallenge {
    public static void main(String[] args) {
        MyRunnable1 runnable = new MyRunnable1();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(runnable);
            t.start();
        }
    }
}

class MyRunnable1 implements Runnable {
    Integer index;
    long startTime;

    {
        index = 1;
        startTime = System.currentTimeMillis();
    }

    @Override
    public void run() {
        while(index <= 100) {
            synchronized (index) {
                System.out.println(index++);
            }
        }
        long time = (System.currentTimeMillis() - startTime);
        System.out.println("Time Taken: " + time + "ms");
    }
}
