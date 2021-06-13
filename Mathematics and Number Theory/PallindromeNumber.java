package dsaCourse;
import java.io.*;
public class PallindromeNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		int n=Integer.parseInt(reader.readLine());
		int number=n;
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		if(number==rev)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a pallindrome");
		}
		
		
	}

}
