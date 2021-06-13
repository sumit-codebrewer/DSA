package dsaCourse;
import java.util.Scanner;
public class TrailingZeroesInFactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		long fact=1L;
		for(int i=n;i>0;i--)
		{
			fact*=i;
		}
		int res=0;
		System.out.println("Factorial:"+fact);
		for(int i=5;i<=n;i=i*5)
		{
			res+=Math.floor(n/i);
		}
		int count=0;
		System.out.println("Number of trailing zeroes:"+res);
	}
	

}
