package string.w3school.com;

public class BasicsOfString2 {

	public static void main(String[] args) {
		String str1 = "Hello This Is Jiya";
		String str2 = "hello this is jiya";
		StringBuffer sb = new StringBuffer(str1);
		System.out.println(str1.contentEquals(sb));
		System.out.println(str2.contentEquals(sb));
		
		
		//Create a new String object with the contents of a character array
		char [] arr = new char[] {'1','2','3','4'};
		String str = String.copyValueOf(arr,0,2);
		System.out.println(str);
		
		System.out.println(str1.equals(str2));
	}
}
