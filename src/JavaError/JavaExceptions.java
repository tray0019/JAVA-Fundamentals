/**
 * @author Rustom Trayvilla
 * @since June 12, 1995
 * @version 1.0
 */
package JavaError;

/*
 * Exception is the term when an error occurs
 */
public class JavaExceptions {

	public static void main(String[] args) {
	
		/*
		 * Exception Handling (try and catch) handles error
		 */
		try {
			/*
			 * Defining block of code to be tested for errors
			 * while it is being executed.
			 */
			
			int[] myNumbers = {1,2,3};
			System.out.println(myNumbers[64]);
			
		}catch(Exception e) {
		
			/*
			 * Allows programmer to define a block of code to be executed, 
			 * if an error occurs in the try block.
			 */
			System.out.println("Exception: Numbers is not within index.");
		}finally {
			System.out.println("Finally output");
		}
			
		checkAge(14);
	}
	
	/*
	 * Throw key word
	 */
	static void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Exception throw? - must be at least 18 years old");
		}else {
			System.out.println("Access granted - You are old enough!");
		}
	}

}
