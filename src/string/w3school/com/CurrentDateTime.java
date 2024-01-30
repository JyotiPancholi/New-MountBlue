package string.w3school.com;

import java.util.Calendar;

//Write a Java program to print the current date and time in the specified format.
public class CurrentDateTime {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Current Date And Time : ");
	    System.out.format("%tb %te %ty", c, c ,c);
	    System.out.println();
	    System.out.format("%tl : %tm: %tp",c,c,c);
	}
}
