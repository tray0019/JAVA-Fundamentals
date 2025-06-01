/**
 * @author Rustom Trayvilla
 * @since May 30, 2025
 * @version 1.1
 */

package JavaBasic;

/**
 * String in Java are considered objects. 
 * When A variable string is initialize 
 * they can perform method. 
 */
public class StringExample {

	public static void main(String[] args) {
		
		String testString = "String Test Sample";
		
		/**
		 * The length() method count the number of character in the testString
		 */
		System.out.println("Method for String Length");
		System.out.println("The length of the String is: "+testString.length());
		
		/*
		 * The toUpperCase() and toLowerCase() are both method
		 * that turn the String to Upper case or Lower Case 
		 */
		System.out.println("\nAll upper case character. - "+testString.toUpperCase());
		System.out.println("All lower case character. - "+testString.toLowerCase());
		
		System.out.println("\nLocate the index of Test");
		System.out.println("Test is at index: "+testString.indexOf("Test"));
		
		/*
		 * Adding a quote in a String
		 */
		
		System.out.println("\n\"To add a quote you must use[\\]\"");
		


	}

}
