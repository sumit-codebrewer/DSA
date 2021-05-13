package initial;

/*
 * Given two arrays X and Y of positive integers, 
 * find the number of pairs such that x^y > y^x (raised to power
 *  of) where x is an element from X and y is an element from Y.
 */
public class NumberOfPairs {
	public static void main(String[] args) {
		int []x= {2,1,6};
		int []y= {1,5};
		System.out.println("Number of pairs:"+countPairs(x, y, x.length, y.length));
	}
	 public static long countPairs(int x[], int y[], int M, int N)
	    {
	        long count=0;
	        for(int i=0;i<M;i++)
	        {
	            for(int j=0;j<N;j++)
	            {
	                if(Math.pow(x[i],y[j])>Math.pow(y[j],x[i])){
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
}
