import java.util.*;

public class DominantElement {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0){
		    int N = sc.nextInt();
		    HashMap<Integer, Integer> map = new HashMap<>();
		    for(int i=0; i<N; i++){
		        int x = sc.nextInt();
		        map.put(x, map.getOrDefault(x, 0)+1);
		    }
		    int maxFrequency = 0;
		    int count = 0;
		    for(int i: map.values()){
		        if(i > maxFrequency){
		            maxFrequency = i;
		            count = 1;
		        }else if(i == maxFrequency){
		            count++;
		        }
		    }
		    if(count == 1){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
        sc.close();
	}
}
