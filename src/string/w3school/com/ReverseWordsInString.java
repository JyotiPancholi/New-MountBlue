package string.w3school.com;

public class ReverseWordsInString {
	static void reverseWords(String str) {
		String arr[] = str.split(" ");
		StringBuilder sb =  new StringBuilder();
		for (int i = arr.length-1; i>=0 ; i--) {
			sb.append(arr[i]);
			sb.append(" ");
		}
		
		System.out.println(sb);
	}
	public static void main(String[] args) {
		String s = "java code to reverse the string";
		reverseWords(s);
	}

}
