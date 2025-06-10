/**
 * @author Rustom Trayvilla
 * @since June 06, 2025
 * @version 1.1
 */
package JavaClass;

/*
 * This class holds variables
 * to be executed in the Main class
 */
public class FirstClass {

	/*
	 * This is an attribute or 
	 * field of the class 
	 */
	String a = "1. String a is printed";
	String b;
	
	/*
	 * The use of final here
	 * cannot modify the number 64
	 * Final key word is 
	 * called a modifier.
	 */
	final int cannotBeChange = 64; 
	
	/**
	 * This is a constructor and 
	 * it's used to initialize
	 * objects. Constructor can 
	 * also take parameter.
	 */
	public FirstClass(String c) {
		b = c;	
		System.out.println("Constructor is set. Initialize!");
	}
	
	/**
	 * Add public to static for it to be 
	 * called in other class
	 */
	public static void staticAccessMethod() {
		//System.out.println(a); -- Not sure why it didnt accept the attribute
		System.out.println("3. Static can be called without creating objects");
	}
	
	public void publicMethod() {
		System.out.println("4. Public needs object to be called");
	}
	
	
}
