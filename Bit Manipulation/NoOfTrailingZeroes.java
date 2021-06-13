package dsaCourse;
import java.math.BigInteger;
import java.util.Scanner;
public class NoOfTrailingZeroes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int count=0;
		while((n&1)==0)
		{
			n=n>>1;
			count++;
		}
		System.out.println("Number of trailing zeroes:"+count);
		
		
	}
	
	
}

