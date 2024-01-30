package string.w3school.com;

import java.util.Arrays;

public class RemoveGivenCharactersFromStrong {

	public static void main(String[] args) {
		String strg = "abrambabasc";
		System.out.print("After removing the specified characters, the new string is: ");
		removeSetofCharacters(strg, "ac", "b");
	}

	private static void removeSetofCharacters(String strg, String string1, String string2) {
		int n = strg.length(), i;
        int ptr = 0;
        char[] arr = strg.toCharArray();
        for (i = 0; i < n; ++i) {
            if (arr[i] == 'b') {
                continue; 
            } else if (i + 1 < n && arr[i] == 'a' && arr[i + 1] == 'c') {
                ++i;
            } else {
                arr[ptr++] = arr[i];
            }
        }
        char[] ret = Arrays.copyOfRange(arr, 0, ptr);
        System.out.println(new String(ret));
    }		
}
