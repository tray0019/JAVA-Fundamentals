///**
// * @author Rustom Trayvilla
// * @since June 12, 1995
// * @version 1.0
// */
//package JavaError;
//
///*
// * Many type of errors in Java.
// * Compile-Time - Detect by compiler. Prevents code from runing.
// * Runtime Error - Occurs while the program is running. Often causes crashes.
// * Logical Error - Code runs but gives incorrect results. Hardest to find.
// */
//public class JavaErrors {
//
//	public static void main(String[] args) {
//		
//		/*Compile-Time Errors
//		 * 1. Missing Semicolon
//		 */
//		int x = 5//missing x
//				System.out.println(x);
//		
//		/*
//		 * 2. Undeclared Variables
//		 */
//		System.out.println(myVar);//no myVar variables created
//		
//		/*
//		 * 3. Mistmatched Types
//		 */
//		int x = "Hello";
//		
//		/*Common Runtime Errors
//		 * 1. Division by Zerop
//		 */
//		int x = 10;
//		int y = 0;
//		int result = x/y;
//		System.out.println(result);
//		//Result: Exception in thread "main" java.lang.ArithmeticException: / by zero
//
//		/*
//		 * 2. Array Index Out of Bonds
//		 */
//		int[] numbers = {1,2,3}
//		System.out.println(numbers[64]);
//		//Result: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 3
//			
//		/*
//		 *Logical Errors 
//		 */
//		int a  = 10;
//		int b = 2;
//		int sum = a - b;
//		System.out.println("x + y = "+sum);
//		
//		
//	}
//	
//	
//	
//}
