// Create a method to return the minimum and maximum values for a variable list of numbers

package com.tertiaryinfotech.day_1.challenges;

class MinMaxValue {
    public static int[] minMaxVals(int... nums) {
        int[] minMax = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            minMax[0] = Math.min(nums[i], nums[i + 1]);
            minMax[1] = Math.max(nums[i], nums[i + 1]);
        }
        return minMax;
    }

    public static void main(String[] args) {
        int[] minMax = minMaxVals(1, 2, 3, -4, 5, 6);
        System.out.printf("Min: %d, Max: %d\n", minMax[0], minMax[1]);
    }
}