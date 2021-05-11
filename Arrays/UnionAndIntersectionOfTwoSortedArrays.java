package loveBabbarCheatsheet;

public class UnionAndIntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		int []a= {9,1,9,1,9,1,0};
		int []b= {8,7,6,5,4,3,2,1};
		union(a,b);
		System.out.println();
		intersection(a, b);

	}
	public static void union(int []a,int []b)
	{
		int c[]=new int[a.length+b.length];
		int j=0;
		boolean isFound;
//		for(int i=0;i<a.length;i++)
//		{
//			c[j++]=a[i];
//		}
		 for(int i=0;i<a.length;i++)
		    {
		        isFound=false;
		        for(int k=0;k<c.length;k++)
		        {
		            if(a[i]!=c[k])
		            {
		                continue;
		            }
		            else if(a[i]==0)
		            {
		            	continue;
		            }
		            else
		            {
		                isFound=true;
		                break;
		            }
		        }
		        if(!isFound)
		        {
		            c[j++]=a[i];
		        }
		    }
		for(int i=0;i<b.length;i++)
		{
			isFound=false;
			for(int k=0;k<j;k++)
			{
				if(b[i]!=c[k])
				{
					continue;
				}
				else
				{
					isFound=true;
					break;
				}
			}
			if(!isFound)
			{
				c[j++]=b[i];
			}
		}
		System.out.println("Union:");
		for(int i=0;i<j;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
	public static void intersection(int []a,int []b)
	{
		int []c=new int[10];
		int val;
		int j=0;
		boolean isFound;
		for(int i=0;i<a.length;i++)
		{
			isFound=false;
			val=a[i];
			for(int k=0;k<b.length;k++)
			{
				if(b[k]!=val)
				{
					continue;
				}
				else
				{
					isFound=true;
					break;
				}
			}
			if(isFound)
			{
				c[j++]=a[i];
			}
		}
		System.out.println("Intersection:");
		for(int i=0;i<j;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
