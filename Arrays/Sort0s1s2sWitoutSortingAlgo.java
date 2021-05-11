package loveBabbarCheatsheet;

public class Sort0s1s2sWitoutSortingAlgo {

	public static void main(String[] args) {
		int a[]= {0,2,1,1,2,0};
		int len=a.length;
		int []b=new int[len];
		int j=0;
		for(int i=0;i<len;i++)
		{
			if(a[i]==0)
			{
				b[j++]=a[i];
			}
		}
		for(int i=0;i<len;i++)
		{
			if(a[i]==1)
			{
				b[j++]=a[i];
			}
		}
		for(int i=0;i<len;i++)
		{
			if(a[i]==2)
			{
				b[j++]=a[i];
			}
		}
		for(int i=0;i<len;i++)
		{
			a[i]=b[i];
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
