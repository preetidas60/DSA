package day10;

import java.util.Arrays;

public class MinimumDiff {
    public static void main(String[] args) {
        int[] nums = { 9, 4, 1, 7 };
        int k = 2;
        System.out.println(minimumDifference(nums, k));
    }

    static int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int currDiff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, currDiff);
        }
        return minDiff;
    }
}
