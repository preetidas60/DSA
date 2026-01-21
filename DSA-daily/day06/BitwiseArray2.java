package day06;

import java.util.List;

public class BitwiseArray2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 10, 15);
        int[] result = minBitwiseArray(nums);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
    public static int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int p = nums.get(i);

            int t = 0;
            int temp = p;
            while ((temp & 1) == 1) {
                t++;
                temp >>= 1;
            }

            if (t == 0) {
                ans[i] = -1;
            } else {
                ans[i] = p - (1 << t) + (1 << (t - 1));
            }
        }
        return ans;
    }
}
