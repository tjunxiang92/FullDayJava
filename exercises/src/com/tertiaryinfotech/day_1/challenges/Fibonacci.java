// Create the Fibonacci Sequence
// Output: 1,1,2,3,5,8,13,21,.....

package com.tertiaryinfotech.day_1.challenges;

public class Fibonacci {

    public static int fibo(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

        int fibonum;

        for (int i = 0; i < 25; i++) {
            fibonum = fibo(i);
            System.out.println(fibonum);
        }
    }
}
