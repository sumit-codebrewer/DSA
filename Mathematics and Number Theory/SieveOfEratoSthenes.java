package dsaCourse;

import java.util.Arrays;

public class SieveOfEratoSthenes {

	public static void main(String[] args) {
		boolean []isPrime=sieveOfEratoSthenes(20);
		for(int i=0;i<=20;i++)
		{
			System.out.println(i+" "+isPrime[i]);
		}

	}
	private static boolean [] sieveOfEratoSthenes(int N)
	{
		boolean isPrime[]=new boolean[N+1];
		Arrays.fill(isPrime,true);
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i*i<=N;i++)
		{
			for(int j=2*i;j<=N;j+=i)
			{
				isPrime[j]=false;
			}
		}
		return isPrime;
	}

}
