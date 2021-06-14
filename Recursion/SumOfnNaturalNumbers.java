package recursion;

import java.util.Scanner;

public class SumOfnNaturalNumbers {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();		
		int res=sum(n);
		System.out.println("Result"+res);
	}
	
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		
		return n+sum(n-1);
	}
}
