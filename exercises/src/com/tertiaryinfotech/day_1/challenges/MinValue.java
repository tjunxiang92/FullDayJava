// Create a method to determine the minimum value for a variable list of numbers

package com.tertiaryinfotech.day_1.challenges;

class MinValue {
    public static int minVal(int... nums) {
        int minNum = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            minNum = Math.min(nums[i], nums[i + 1]);
        }
        return minNum;
    }

    public static void main(String[] args) {
        System.out.println(minVal(1, 2, 3, -4, 5, 6));
    }
}