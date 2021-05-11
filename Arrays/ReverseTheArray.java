package loveBabbarCheatsheet;
import java.util.Scanner;
public class ReverseTheArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		reverseArray(a);
		
	}
	public static void reverseArray(int []arr)
	{
		int maxLength=arr.length-1;
		int halfLength=arr.length/2;
		int temp;
		for(int i=0;i<halfLength;i++)
		{
			temp=arr[i];
			arr[i]=arr[maxLength-i];
			arr[maxLength-i]=temp;
		}
		System.out.println("Reversed array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
