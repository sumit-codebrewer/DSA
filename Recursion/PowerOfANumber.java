package recursion;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=power(a,b);
		System.out.println("Result:"+res);
	}
	
	public static int power(int a,int b) {
		if(b==0) {
			return 1;
		}
		
		return a*power(a,b-1);
	}

}
