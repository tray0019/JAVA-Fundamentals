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
	
	/**
	 * In this method we have a parameter.
	 * Parameter can be pass to methods.
	 * @param name
	 */
	static void methodTwo(String name) {
		System.out.println("2. Your name is "+name);
	}
	
	static void methodThree(String lastName, int age) {
		System.out.println("3. Last name: "+lastName+ "and age: "+ age);
	}
	
	static void methodFour(int favouriteNumber) {
		if(favouriteNumber < 10) {
			System.out.println("4. Your number is less than 10");
		}else {
			System.out.println("4. Your number is above 10.");
		}
	}
	
	/**
	 * The return value heres return it 
	 * back to the method with addition
	 * of 5.
	 * @param returnAddNumber
	 */
	static int methodFive(int returnAddFive) {
		return returnAddFive + 5;
	}
	
	/**
	 * Two parameters that does multiplication
	 * @param a
	 * @param b
	 * @return
	 */
	static int methodSix(int a, double b) {
		return (int)(a*b);
	}
	
	public void testMethod() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		
		methodOne();
		//Method can be called multiple times
		methodOne();
		
		//Method two with parameter
		methodTwo("Tom");
		methodTwo("Russ");
		
		//Method three multiple parameter
		methodThree("Nem",29);
		methodThree("Villa",30);
		
		//Method four with if else statement
		methodFour(64);
		
		//Method Five with return
		System.out.println("5: Return Method: "+methodFive(64));
		
		//Method Six return with multiple parameter
		System.out.println("6: Multiple parameter: "+methodSix(8,8));
		
		//Or store it in a variable
		int c = methodSix(1,64);
		System.out.println("6: Stored in variable c: "+c);
		
		

	}

}
