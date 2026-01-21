package day03;
import java.util.*;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
    public static int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLen = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            
            if(sum == k){
                maxLen = i + 1;
            }
            
            if(map.containsKey(sum - k)){
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
