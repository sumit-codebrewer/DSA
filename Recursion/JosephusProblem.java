package recursion;

import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Recursion Problem
		
		System.out.println("Enter the number of men playing game:");
		int n=sc.nextInt();
		
		System.out.println("Enter the position of the target:");
		int k=sc.nextInt();
		
		int winner=josephus(n,k);
		System.out.println("The winner of the game is man"+winner);

	}
	
	public static int josephus(int n,int k) {
		if(n==1) {
			return 0;
		}
		
		return (josephus(n-1, k)+k)%n;
	}

}
