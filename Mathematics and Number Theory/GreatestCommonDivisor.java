package dsaCourse;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(gcd(24,60));
		System.out.println(gcd(180,25));

	}
	public static int gcd(int a,int b)
	{
		if(b==0) 
			return a;
		return gcd(b,a%b);
	}
}
