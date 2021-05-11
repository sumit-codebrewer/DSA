package loveBabbarCheatsheet;
import java.util.Scanner;
public class MovingNegativeElementsToOneSide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		movingLeft(a, size);
		System.out.println();
		movingRight(a,size);
	}
	public static void movingLeft(int []arr,int n)
	{
		int temp;
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				if(i!=j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void movingRight(int []arr,int n)
	{
		int temp;
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				if(i!=j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
