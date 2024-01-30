package array.practice.com;

public class CallByValueCallByReference {
	public static int sum(int i) {
		i=20;
		return i;
	}
	public static void main(String[] args) {
		int i=10;
		int x = sum(i);
		System.out.println(i);
		System.out.println(x);
	}
}
