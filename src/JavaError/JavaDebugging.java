/**
 * @author Rustom Trayvilla
 * @since June 12, 1995
 * @version 1.0
 */
package JavaError;

/*
 * Process of identifying and fixing errors or bugs in code.
 */
public class JavaDebugging {

	/*
	 * - Reading error messages
	 * - Tracing variable values step by step
	 * Testing small piece of code independently
	 */
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		System.out.println("Before division");//debug output
		
		//int result = 10/0;//will crash
		//System.out.println("Result: "+ result);
		
		/*
		 * Check Variable Values
		 */
		int age = 17;
		System.out.println("Age: "+age);
		
		if(age >= 18) {
			System.out.println("Access granted");
		} else {
			System.out.println("Access denied");
		}
		

	}

}
