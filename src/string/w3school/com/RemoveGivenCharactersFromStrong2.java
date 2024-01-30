package string.w3school.com;

public class RemoveGivenCharactersFromStrong2 {

	public static String removePatterns(String str) {
        str = str.replace("ac", "");
        str = str.replace("b", "");
        return str;
    }

    public static void main(String[] args) {
        String originalString = "abrambabasc";
        System.out.println("The given string is: " + originalString);

        String modifiedString = removePatterns(originalString);
        System.out.println("After removing, the new string is: " + modifiedString);
    }
}