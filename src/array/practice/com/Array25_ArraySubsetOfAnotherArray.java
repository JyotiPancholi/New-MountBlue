package array.practice.com;

import java.util.HashSet;
import java.util.Set;

public class Array25_ArraySubsetOfAnotherArray {

	public static void main(String[] args) {
		int arr1[] = {10, 5, 2, 5,23, 19};
		int arr2[] = {19, 5, 3};
		Set<Integer> set = new HashSet<Integer>();
		for (Integer integer : arr1) {
			set.add(integer);
		}
		int count =0;
		for (int i = 0; i < set.size(); i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (set.contains(arr1)) {
					count++;
				}
			}
		}
		if (count>=arr2.length) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
}
