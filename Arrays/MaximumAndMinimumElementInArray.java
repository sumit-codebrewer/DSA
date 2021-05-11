package loveBabbarCheatsheet;
import java.util.Scanner;
public class MaximumAndMinimumElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int []array=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		findMaxAndMin(array);
		
	
	}
	public static void findMaxAndMin(int []arr)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum element:"+max);
		System.out.println("Minimum element:"+min);
	}
}
