package dsaCourse;

public class ModuloArithmetics {

	public static void main(String[] args) {
		System.out.println(fastPower(3, 5));
		System.out.println(fastPower2(482629, 5, 10000007));
	}
	public static int fastPower(int a,int b)
	{
		int res=1;
		while(b>0)
		{
			if((b&1)!=0)
			{
				res=res*a;
			}
			a=a*a;
			b=b>>1;
		}
		return res;
	}
	public static long fastPower2(int a,int b,int n)
	{
		long res=1L;
		while(b>0)
		{
			if((b&1)!=0)
			{
				res=(res%n*a%n)%n;
			}
			a=(a%n*a%n)%n;
			b=b>>1;
		}
		return res;
	}

}
