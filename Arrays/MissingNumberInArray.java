package initial;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,8,9};
		int n=arr.length;
		System.out.println("Missing number in an array:"+missingNumber(arr,n));

	}
	public static int missingNumber(int array[], int n) {
        int arraySum=0,naturalSum=0;
        for(int i=0;i<n-1;i++){
            arraySum+=array[i];
        }
        
        for(int i=1;i<=n;i++){
            naturalSum+=i;
        }
        return (naturalSum-arraySum);
	}
}
