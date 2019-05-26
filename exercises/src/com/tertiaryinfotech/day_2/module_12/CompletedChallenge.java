package com.tertiaryinfotech.day_2.module_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompletedChallenge {
    static Scanner input;

    static {
        input = new Scanner(System.in);
    }

    public static int readInput() {
        int inputNum;
        do {
            try {
                System.out.print("Input a number: ");
                inputNum = input.nextInt();
                if (inputNum < 0)
                    throw new Exception("Input 1 must be positive");
            } catch (InputMismatchException e) {
                input.next();
                System.out.println(e.toString());
                inputNum = -1;
            } catch (Exception e) {
                System.out.println(e.toString());
                inputNum = -1;
            }
        } while (inputNum == -1);
        return inputNum;
    }

    public static void main(String[] args) {
        int input1 = readInput();
        int input2 = readInput();

        try {
            System.out.println("Output: " + (input1 / input2));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
