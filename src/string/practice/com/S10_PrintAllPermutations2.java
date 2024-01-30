package string.practice.com;

public class S10_PrintAllPermutations2 {

	static void swap(char[] arr, int x, int y) {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void permute(char[] a, int l, int r) {
        if (l == r) {
            System.out.println(new String(a));
        } else {
            for (int i = l; i <= r; i++) {
                swap(a, l, i);
                permute(a, l + 1, r);
                swap(a, l, i); // backtrack
            }
        }
    }
	public static void main(String[] args) {
		String s = "ABC";
		char[] str = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			str[i]=s.charAt(i);
		}
	        int n = str.length;
	        permute(str, 0, n - 1);
	}
}
