package initial;

import java.util.HashMap;
import java.util.Scanner;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 	System.out.println("Enter size:");
	        int n = sc.nextInt();
	        System.out.println("Enter the value of sum:");
	        int k = sc.nextInt();
	        int[] arr = new int[n];
	        HashMap<Integer, Integer> fre = new HashMap<Integer, Integer>();
	        System.out.println("Now enter array elements");
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	            Integer j = fre.get(arr[i]); 
	            fre.put(arr[i], (j == null) ? 1 : j + 1); 
	        }
	        int answer = 0;
	        for (int i = 0; i < n; i++)
	        {
	            if (arr[i] == k - arr[i])
	            {
	                answer += (fre.get(arr[i]) - 1);
	            }
	            else
	            {
	                Integer j = fre.get(k - arr[i]); 
	                if(j!=null)
	                    answer += j;
	            }
	        }
	        answer /= 2;
	    System.out.println("Number of pairs with the given sum are: "+answer);

	}

}
