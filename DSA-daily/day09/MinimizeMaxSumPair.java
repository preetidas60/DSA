package day09;

import java.util.Arrays;

public class MinimizeMaxSumPair {
    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        int result = minPairSum(nums);
        System.out.println(result);
    }
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length -1;
        int sum = 0;
        while(left < right){
            int maxSum = nums[left] + nums[right];
            sum = Math.max(sum, maxSum);
            left++;
            right--;
        }
        return sum;
    }
}
