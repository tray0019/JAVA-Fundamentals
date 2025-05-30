/**
 * @author Rustom Trayvilla
 * @since May 30, 2025
 * @version 1.1
 */
package JavaBasic;

/**
 * This class explain about Type Casting.
 * Type casting is when you assign a value 
 * of one primitive data type to another type. 
 * Basically in my understanding changing Data Types.
 * 
 */
public class TypeCast {

	/**
	 * Widening casting: Automatically converting smaller data type to larger type size.
	 * Narrowing Casting: Manually converting larger type to a smaller size type.
	 */
	
	public static void main(String[] args) {
		
		/**
		 * Widening Casting sample
		 */
		
		int myInt = 64;
		double myDouble = myInt;
		
		System.out.println("Widening Casting");
		System.out.println( "int myInt = 64; ["+ myInt+"] | "+ "double myDouble = myInt; ["+myDouble+"]");
		System.out.println();

		/**
		 * Narrowing Casting sample
		 */
		
		double aDouble = 64.64;
		int aInt = (int) aDouble;
		
		System.out.println("Narrowing Casting");
		System.out.println("double aDouble = 64.64; ["+aDouble+"] | "+"int aInt = (int) aDouble; ["+aInt+"]");
		
		/**
		 * Real life example that calculates the users score in relation
		 * of the maximum score
		 */
		
		System.out.println("\nUser to Max Percentage Score Calculation");
		int userScore = 250;
		System.out.println("User Score: "+userScore);
		
		int maxScore = 500;
		System.out.println("Maximum score is 500");
		
		float percentage =  userScore/(float)maxScore*100.0f;
		
		System.out.println("Total Percentage of user score is "+percentage);
		
		
		
	}

}
