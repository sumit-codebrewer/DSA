package loveBabbarCheatsheet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionModified {

	public static void main(String[] args) {
		int []arr1= {1,2,5,8,6,3,3};
		int []arr2= {3,8,9,2,10};
		unionArrays(arr1,arr2);
		intersectionArrays(arr1,arr2);
	}
	private static void unionArrays(int []arr1,int []arr2) {
		Set<Integer> array1=new HashSet<Integer>();
		Integer []array11=Arrays.stream( arr1 ).boxed().toArray( Integer[]::new );
		array1.addAll(Arrays.asList(array11));
		Set<Integer> array2=new HashSet<Integer>();
		for(int i=0;i<arr2.length;i++) {
			array2.add(arr2[i]);
		}
		Set<Integer> union=new HashSet<Integer>(array1);
		union.addAll(array2);
		System.out.println("Union of two arrays");
		for(int i:union) {
			System.out.print(i+" ");
		}		
		
	}
	private static void intersectionArrays(int []arr1,int []arr2) {
		Set<Integer> array1=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			array1.add(arr1[i]);
		}
		Set<Integer> array2=new HashSet<Integer>();
		for(int i=0;i<arr2.length;i++) {
			array2.add(arr2[i]);
		}
		
		Set<Integer> intersection=new HashSet<Integer>(array1);
		intersection.retainAll(array2);
		System.out.println("Intersection of two arrays");
		for(int i:intersection) {
			System.out.print(i+" ");
		}
	}

}
