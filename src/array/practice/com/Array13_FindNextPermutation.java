package array.practice.com;

import java.util.Arrays;

public class Array13_FindNextPermutation {
	public void nextPermutation(int[] nums) {

		int index = -1, 
		n = nums.length;
		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				index = i;
				break;
			}
		}
		for (int i = n - 1; i >= 0 && index != -1; i--) {
			if (nums[i] > nums[index]) {
				int temp = nums[index];
				nums[index] = nums[i];
				nums[i] = temp;
				break;
			}
		}
		int l = index + 1, r = n - 1;
		while (l < r) {
			int temp = nums[l];
			nums[l] = nums[r];
			nums[r] = temp;
			l++;
			r--;
		}
	}

	public static void main(String[] args) {
		Array13_FindNextPermutation a = new Array13_FindNextPermutation();
		int nums [] = {3,2,1};
		a.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}
}
