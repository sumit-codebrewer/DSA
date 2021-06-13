package dsaCourse;
import java.util.Scanner;
public class DistinctElementsInDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a= {6,8,9,2,8,2,6};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			temp ^= a[i];
		}
		System.out.println("Unique elements when every element is repeated twice:"+temp);

	}

}
