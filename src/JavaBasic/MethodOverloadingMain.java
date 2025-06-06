/**
 * @author Rustom Trayvilla
 * @since June 05, 2025
 * @version 1.0
 */
package JavaBasic;

/*
 * Method overload can have similar 
 * method name with different data types
 */
public class MethodOverloadingMain {

	static int plusMethod(int a, int b) {
		return a+b;
	}
	
	static double plusMethod(double a, double b) {
		return a+b;
	}
	
	/*
	 * The method overload above is similar to 
	 * having two methods with different name. 
	 */
	
	public static void main(String[] args) {

		int myNum = plusMethod(60,4);
		double myNum2 = plusMethod(60.99,3.01);
		
		System.out.println("1. Integer Output: "+ myNum);
		System.out.println("2. Double Output: "+myNum);
		
		/*
		 * Recursion Function
		 */
		
		int result = sum(2);
		System.out.println(result);
		
		System.out.println(factorial(4));
		
	}
	
	public static int factorial(int n) {
	    if (n == 1) {
	    	return 1;   
	    	}else {
	    		return n * factorial(n - 1); }      // base case
	     // recursive case
	}

	
	/**
	 * This is a recursion function 
	 * that calls it self
	 * @param k
	 * @return
	 */
	public static int sum(int k) {
		if(k>0) {
			return k + sum(k-1);
		}else {
			return 0;
		}
	}

}

/*
 * NEED TO GO BACK TO THIS TO FULLY UNDERSTAND RECURSION
 */
