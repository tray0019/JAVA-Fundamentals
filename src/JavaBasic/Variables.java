/*
 * @author Rustom Trayvilla
 * @version 1.1 
 * @since 2025-05-25
 */
package JavaBasic;

/*
 * This class will be all about variables
 * Variables are containers for storing data and values
 */
public class Variables {
	
	public static void main(String[] args) {
		
		//Stores Tom in the name and print it out
		String name = "Tom";
		System.out.println("Name: "+ name);
		
		//Store 64 on num and print it out
		int num = 64;
		System.out.println("Number: "+ num);
		
		//Variable can be updated
		num = 65;
		System.out.println("New Number: "+ num);
		
		//Make sure to have the f at the end. Unique name like floatingNum here is called identifiers.
		float floatingNum = 64.99f;
		System.out.println("Float: "+ floatingNum);
		
		//Can only store single character
		char singleLetter = 'f';
		System.out.println("Char: "+ singleLetter);
		
		//Can only store true or false
		boolean trueFalse = false;
		System.out.println("Boolean: "+ trueFalse);
		
		//The final here makes this variable constant or cannot be updated
		final int unchangeNum = 64;
		System.out.println("Unchange Number: "+ unchangeNum);
		
		//Adding 
		int numTwo = 5;
		int addNum = num + numTwo;
		System.out.println("Total: "+addNum);
		
		
		//Assigning multiple value in one line
		int a,b,c;
		a=b=c= 64;
		
		System.out.println("A="+a+" B="+b+" C="+c);
		
		/**
		 * All data types use here are primitive
		 */
		
		
	}

}
