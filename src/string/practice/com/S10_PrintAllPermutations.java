package string.practice.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S10_PrintAllPermutations {

	public void solve(String a, String b, List<String> ans) {
		if (a.length() <= 0 && !ans.contains(b)) {
			ans.add(b);
			return;
		}
		for (int i = 0; i < a.length(); i++) {
			String ros = a.substring(0, i) + a.substring(i + 1);
			solve(ros, b + a.charAt(i), ans);
		}
	}
	public List<String> find_permutation(String S) {
		List<String> ans = new ArrayList<>();
		solve(S, "", ans);
		Collections.sort(ans);
		return ans;
	}

	public static void main(String[] args) {
		String s = "ABC5";
		S10_PrintAllPermutations x =  new  S10_PrintAllPermutations();
		List<String> list = x.find_permutation(s);
		System.out.println(list);
	}
}
