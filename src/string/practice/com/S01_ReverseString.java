package string.practice.com;

public class S01_ReverseString {

	public static void main(String[] args) {
		String str ="Hello Mount Blue";
		String s ="";
		char ch ;
		for(int i=0 ; i<=str.length()-1;i++) {
			ch=str.charAt(i);
			s=ch+s;
		}
		System.out.println("Reverse String : "+s);
	}
}
