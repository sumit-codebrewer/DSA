package dsaCourse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NoOfSetBits {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		System.out.println("Enter a number:");
		int n=Integer.parseInt(reader.readLine());
		while(n!=0)
		{
			n=(n&n-1);
			count++;
		}
		System.out.println("Number of set bits:"+count);

	}

}
