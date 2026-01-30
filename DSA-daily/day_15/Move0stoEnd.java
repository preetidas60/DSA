class Move0stoEnd {
   static void pushZerosToEnd(int[] arr) {
        // code here
        int current = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[current];
                arr[current] = arr[i];
                arr[i] = temp;
                current++;
            }
        }
    }
        public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr);
        System.out.println("Array after pushing zeros to the end:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}