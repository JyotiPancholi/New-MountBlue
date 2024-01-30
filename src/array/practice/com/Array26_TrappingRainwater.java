package array.practice.com;

public class Array26_TrappingRainwater {

	static int trap(int[] height) {
		int n = height.length;

		if (n <= 2) {
			return 0; 
		}

		int leftMax = 0, rightMax = 0;
		int left = 0, right = n - 1;
		int waterTrapped = 0;

		while (left < right) {
			if (height[left] < height[right]) {
				leftMax = Math.max(leftMax, height[left]);
				waterTrapped += Math.max(0, leftMax - height[left]);
				left++;
			} else {
				rightMax = Math.max(rightMax, height[right]);
				waterTrapped += Math.max(0, rightMax - height[right]);
				right--;
			}
		}

		return waterTrapped;
	}

	public static void main(String[] args) {
		int[] arr = {6,9,9};
		System.out.println("Output: " + trap(arr));
	}

}
