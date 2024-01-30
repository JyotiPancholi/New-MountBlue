package array.practice.com;

import java.util.HashSet;
import java.util.Set;

public class Array06_FindUnionAndIntersection {

	public static void main(String[] args) {
		int arr1[] = {1,3,5,7,9};
		int arr2[] = {2,4,6,8,10,3,9,11};
		Set<Integer> set =  new HashSet<Integer>();
		for (Integer integer : arr1) {
			set.add(integer);
		}
		for (Integer integer : arr2) {
			set.add(integer);
		}
		System.out.println("Union Of Arrays :  "+set.size());
		
//---------------------------intersection-------------------------------
		 Set<Integer> set1 = new HashSet<>();
	        for (int element : arr1) {
	            set1.add(element);
	        }
		 Set<Integer> intersectionSet = new HashSet<>();
	        for (int element : arr2) {
	            if (set1.contains(element)) {
	                intersectionSet.add(element);
	            }
	        }
	        System.out.println("Intersection of two Arrays : "+intersectionSet);
	}
}
