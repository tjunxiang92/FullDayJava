package com.tertiaryinfotech.day_2.module_9;

import java.util.Arrays;

public class CompletedChallenge {
    public final static int[] staticArr;
    public int[] memberClassArr;

    // Static Initializer
    static {
        staticArr = new int[10];
        for (int i = 1; i <= staticArr.length; i++) {
            staticArr[i - 1] = i * i;
        }
    }

    // Member Class Initializer
    {
        memberClassArr = new int[10];
        for (int i = 1; i <= staticArr.length; i++) {
            memberClassArr[i - 1] = (int) Math.pow(i + 10, 2);
        }
    }

    public static void main(String[] args) {
        CompletedChallenge c = new CompletedChallenge();
        System.out.println(Arrays.toString(CompletedChallenge.staticArr));
        System.out.println(Arrays.toString(c.memberClassArr));
    }
}
