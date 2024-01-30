package string.w3school.com;

public class ReverseAnString {

	public static void main(String[] args) {
		String s = "helloworld";
		String s1="";
		char ch ;
		
//		for (int i = 0; i <s.length(); i++) {
//			ch=s.charAt(i);
//			s1=ch+s1;
//		}
//		System.out.println(s1);
		
		
		for (int i = s.length()-1; i >=0; i--) {
			s1+=s.charAt(i);
		}
		System.out.println(s1);
	}
}
