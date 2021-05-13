package initial;
import java.util.Scanner;
public class HighestDivisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int maxDiv=0;
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			if(n%i==0)
			{
				maxDiv=i;
			}
		}
//		if(maxDiv==0)
//		{
//			maxDiv=1;
//		}
		System.out.println("Highest divisor between 1 and 10:"+maxDiv);

	}

}
