package reursion.practice.com;

public class ReverseStringUsingRecursion {

	static void reverseString(String str) {
		int n = str.length();
		
		if (str==null ||  n <=1) {
			System.out.println(str);
		}else {
			System.out.print(str.charAt(n-1));
			reverseString(str.substring(0,n-1));
		}
	}
	public static void main(String[] args) {
		String str = "helloworld";
		reverseString(str);
	}
}
