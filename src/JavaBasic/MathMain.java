/**
 * @author Rustom Trayvilla
 * @since June 01, 2025
 * @version 1.1
 */
package JavaBasic;

/*
 * This Math class are all about built-in
 * math method. 
 */
public class MathMain {

	public static void main(String[] args) {
		
		/*
		 * Math.max() is a method that finds the highest number
		 */
		System.out.println("Which number is higher, 64 or 24? "+Math.max(64, 24));

		/*
		 * Math.min() is a method that finds the lowest number 
		 */
		System.out.println("Which number is lower, 64 or 24? "+Math.min(64, 24));
		
		/*
		 * Math.sqrt() square root a given number
		 */
		System.out.println("What is the square root of 64? "+Math.sqrt(64));
		
		/*
		 *Math.abs() returns the absolute value of x
		 */
		System.out.println("What's the absolute number of -4.7? "+Math.abs(-4.7));
		
		/*
		 * Math.random() returns a random number
		 */
		System.out.println("A random number between 1-100. "+(int)(Math.random()*100));
	}

}
