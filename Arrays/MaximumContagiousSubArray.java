package loveBabbarCheatsheet;
public class MaximumContagiousSubArray {

	public static void main(String[] args) {
		//Using Kaden's Algorithm
		int []arr= {2,5,7,-1,2,-5,8};
		maxSubArray(arr);
		minSubArray(arr);

	}
	public static void maxSubArray(int []a)
	{
		int max_so_far=0;
		int max_ending_here=0;
		for(int i=0;i<a.length;i++)
		{
			max_ending_here+=a[i];
			if(max_ending_here<0)
			{
				max_ending_here=0;
			}
			//For positive contagious elements
			else if(max_so_far<max_ending_here)
			{
				max_so_far=max_ending_here;
			}
		}
		System.out.println("Maximum subarray sum:"+max_so_far);
	}
	public static void minSubArray(int []a)
	{
    	int min_so_far=0;
		int min_ending_here=0;
		for(int i=0;i<a.length;i++)
		{
			min_ending_here+=a[i];
			if(min_ending_here>0)
			{
				min_ending_here=0;
			}
			//For positive contagious elements
			else if(min_so_far>min_ending_here)
			{
				min_so_far=min_ending_here;
			}
		}
		System.out.println("Minimum subarray sum:"+min_so_far);
	}
	

}
