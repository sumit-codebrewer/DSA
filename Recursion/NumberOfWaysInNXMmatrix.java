package recursion;

import java.util.Scanner;

public class NumberOfWaysInNXMmatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int cols=sc.nextInt();
		
		int result=count(rows,cols);
		System.out.println("Number of ways in N X M matrix:"+result);
	}
	
	public static int count(int n,int m) {
		if(n==1 || m==1) {
			return 1;
		}
		
		return count(n-1,m)+count(n,m-1);
	}

}
