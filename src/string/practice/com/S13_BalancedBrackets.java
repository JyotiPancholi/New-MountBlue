package string.practice.com;

import java.util.Stack;

public class S13_BalancedBrackets {
	static boolean ispar(String x) {
		Stack<Character> st = new Stack<>();
		for (int j = 0; j < x.length(); j++) {
			char ch = x.charAt(j);
			if (ch == '{' || ch == '[' || ch == '(') {
				st.push(ch);
			} else {
				if (st.isEmpty()) {
					return false;
				}
				if ((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']')
						|| (st.peek() == '{' && ch == '}')) {
					st.pop();
				} else {
					return false;
				}
			}
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		String exp1 = "{([])}";
		System.out.println(ispar(exp1) ? "balanced" : "not balanced");

		String exp2 = "()";
		System.out.println(ispar(exp2) ? "balanced" : "not balanced");
	}

}
