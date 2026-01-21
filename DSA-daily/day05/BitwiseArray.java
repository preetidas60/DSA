package day05;

import java.util.List;

public class BitwiseArray {
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

        for(int i=0; i<n; i++){
            int num = nums.get(i);
            ans[i] = -1;

            for (int x = 0; x <= num; x++) {
                if ((x | (x + 1)) == num) {
                    ans[i] = x;
                    break;   
                }
            }
        }
        return ans;
    }

}
