package initial;

public class CountTriples {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println("Number of triplets:"+countWays(arr, n));

	}
	public static int countWays(int[] arr,int n){
		 int count=0,max_ending_here=0,max_so_far=0;
	        for(int i=0;i<n;i++)
	        {
	            max_ending_here+=arr[i];
	            if(max_ending_here>max_so_far)
	            {
	                max_so_far=max_ending_here;
	            }
	            if(max_ending_here<0)
	            {
	                max_ending_here=0;
	            }
	        }
			int []freq=new int[max_so_far+1];
			for(int i=0;i<n;i++) {
				freq[arr[i]]++;
			}
			
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(freq[arr[i]+arr[j]]>0)
				{
					count++;
				}
			}
		}
	
		return count;
	}

}
