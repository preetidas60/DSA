package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 6, 10, 15 };
        System.out.println(minimumAbsDifference(arr));
    }

    static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int currDiff = arr[i + 1] - arr[i];
            minDiff = Math.min(minDiff, currDiff);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            List<Integer> pair = new ArrayList<>();

            if (arr[i + 1] - arr[i] == minDiff) {
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }

        return ans;

    }
}
