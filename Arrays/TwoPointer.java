package loveBabbarCheatsheet;

public class TwoPointer {

	public static void main(String[] args) {
		int []a= {1,4,-5,-7,9,-4};
		shiftValues(a, 0, a.length-1);
	}

	public static void shiftValues(int []arr,int left,int right)
	{
		while(left<right)
		{
			if(arr[left]<0&&arr[right]<0)
			{
				left++;
			}
			else if(arr[left]>0&&arr[right]<0)
			{
				int temp;
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
			else if(arr[left]<0&&arr[right]>0)
			{
				right--;
			}
			else
			{
				left++;
				right--;
			}
		}
		System.out.println("Printing array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
