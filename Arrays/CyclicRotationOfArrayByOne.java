package loveBabbarCheatsheet;
import java.util.Scanner;
public class CyclicRotationOfArrayByOne {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		cyclicRotation(a);
	}
	public static void cyclicRotation(int []arr)
	{
		int val=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=val;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
