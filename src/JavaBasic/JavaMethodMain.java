/**
 * @author Rustom Trayvilla
 * @since June 5, 2025
 * @version 1.1
 */
package JavaBasic;

public class JavaMethodMain {

	/*
	 * Method is block of code that is run when its called
	 */
	
	/*
	 * This is a static method means
	 * method belongs to the main class.
	 */
	static void methodOne() {
		System.out.println("1. Run Method One");
	}
	
	public static void main(String[] args) {
		
		methodOne();
		//Method can be called multiple times
		methodOne();
		
		

	}

}
