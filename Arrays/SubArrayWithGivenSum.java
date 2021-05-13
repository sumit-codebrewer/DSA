package initial;

public class SubArrayWithGivenSum {
	public static void main(String[] args)
	{
		 int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
	     int n = arr.length;
	     int sum = 23;
	     subArraySum(arr, n, sum);
	}
	public static void subArraySum(int []a,int n,int s)
	{
		int start=0,current_sum=a[0];
		boolean found=false;
		for(int i=1;i<=n;i++){
			while(current_sum>s&&start<i-1){
				current_sum-=a[start];
				start++;
			}
			
			if(current_sum==s) {
				int p=i-1;
				System.out.println("Sum found between indexes:"+start+"  "+p);
				found=true;
				break;
			}
			if(i<n){
				current_sum+=a[i];
			}
			else if(i==n&&!found)
			{
				System.out.println("Subarray not found");
			}
		}
	}

}
