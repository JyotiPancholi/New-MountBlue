package string.w3school.com;

public class FindAllPermutations {
	public static void main(String[] args) {
		permutationWithRepeation("PQR");
	}

	private static void permutationWithRepeation(String str1) {
        System.out.println("The given string is: PQR");
        System.out.println("The permuted strings are:");
        showPermutation(str1, "");
    }

	private static void showPermutation(String str1, String newString) {
        if (newString.length() == str1.length()) {
            System.out.println(newString);
            return;
        }

        for (int i = 0; i < str1.length(); i++) {
            showPermutation(str1, newString + str1.charAt(i));
        }
    }
}