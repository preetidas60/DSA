import java.util.ArrayList;
import java.util.*;

class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 4, 1};
        ArrayList<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates); 
    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                list.add(arr[i]);
            }
            set.add(arr[i]);
        }
        return list;
    }
}