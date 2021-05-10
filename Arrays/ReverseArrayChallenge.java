package hustleolder8;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArrayChallenge {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int values[]=getInput(n);
		System.out.println("Original Array:"+Arrays.toString(values));
		
		reverseArray(values);
		System.out.println("Reversed Array:"+Arrays.toString(values));

	}
	public static int[] getInput(int number)
	{
		int []values=new int[number];
		for(int i=0;i<values.length;i++)
		{
			values[i]=sc.nextInt();
		}
		return values;
	}
	public static void reverseArray(int[] arr)
	{
		int maxLength=arr.length-1;
		int halfLength=arr.length/2;
		for(int i=0;i<halfLength;i++)
		{
			int temp=arr[i];
			arr[i]=arr[maxLength-i];
			arr[maxLength-i]=temp;
		}
	}

}
