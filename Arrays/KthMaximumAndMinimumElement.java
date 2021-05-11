package loveBabbarCheatsheet;
import java.util.Arrays;
import java.util.Scanner;
public class KthMaximumAndMinimumElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a= {4,3,1,2,6,7,1};
		System.out.println("Enter value of k:");
		int k=sc.nextInt();
		findKthMaxAndMin(a,k);

	}
	public static void findKthMaxAndMin(int []arr,int k) 
	{
		Arrays.sort(arr);
		int []b=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				b[j++]=arr[i];
			}
		}
		b[j++]=arr[arr.length-1];
		for(int i=0;i<j;i++)
		{
			arr[i]=b[i];
		}
		int min=arr[k-1];
		int max=arr[j-k];
		if(max>min)
		{
			System.out.println("Maximum kth element:"+max);
			System.out.println("Minimum kth element:"+min);
		}
		else
		{
			System.out.println("Maximum and minimum value can't be defined for this value of k");
		}
	}

}
