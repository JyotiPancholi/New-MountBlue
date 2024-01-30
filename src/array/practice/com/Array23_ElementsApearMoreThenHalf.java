package array.practice.com;

import java.util.HashMap;
import java.util.Map;

public class Array23_ElementsApearMoreThenHalf {
 
	public static void elementFreq(int[]arr,int k) {
		int x = arr.length/k;
		Map<Integer, Integer> map=  new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for (Map.Entry mapple : map.entrySet()) {
			Integer temp = (Integer) mapple.getValue();
			if (temp>x) {
				System.out.print(mapple.getKey()+" ");
			}
		}
	} 
	public static void main(String[] args) {
		int arr[] = {9, 8, 7, 9, 2, 9, 7};
		int k = 3;
		elementFreq(arr,k);
	}

}
