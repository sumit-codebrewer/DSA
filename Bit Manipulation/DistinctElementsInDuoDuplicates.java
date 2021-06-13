package dsaCourse;

public class DistinctElementsInDualDuplicates {
	public static void main(String[] args)
	{
		int temp=0;
		int []a= {4,3,5,1,3,5};
		for(int i=0;i<a.length;i++)
		{
			temp ^=a[i];
		}
		
		temp=temp&-temp;
		
		int temp1=0;
		int temp2=0;
		
		for(int i=0;i<a.length;i++)
		{
			if((a[i]&temp)>0)
			{
				temp1=temp1^a[i];
			}
			else
			{
				temp2=temp2^a[i];
			}
		}
		System.out.println("Unique elements are "+temp1+" and "+temp2);
		
	}
}
