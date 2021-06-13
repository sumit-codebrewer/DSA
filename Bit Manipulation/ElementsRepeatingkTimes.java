package dsaCourse;
public class ElementsRepeatingkTimes {

	public static void main(String[] args) {
		byte byteSize=4;
		int INT_SIZE=byteSize*4;
		int []count=new int[INT_SIZE];
		int []a= {3,5,6,2,5,3,2,3,5,2};
		
		for(int i=0;i<INT_SIZE;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if((a[j] & 1<<i)!=0)
				{
					count[i]++;
				}
					
			}
		}
		
		int res=0;
		int k=3;
		for(int i=0;i<INT_SIZE;i++)
		{
			res+=(count[i]%k)*1<<i;
		}
		System.out.println("Unique element when every element is repeating three times:"+res);
	}

}
