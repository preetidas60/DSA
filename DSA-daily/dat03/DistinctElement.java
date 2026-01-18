import java.util.*;

public class DistinctElement {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T-- > 0){
		    int N = sc.nextInt();
		    int[] arr = new int[N];
		    int max = 0;
		    for(int i=0; i< arr.length; i++){
		        arr[i] = sc.nextInt();
		        max = Math.max(max, arr[i]);
		    }
		    System.out.println(max);
		}
        sc.close();
	}
}
