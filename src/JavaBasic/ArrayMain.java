/**
 * @author Rustom Trayvilla
 * @since June 03, 2025
 * @version 1.0
 */
package JavaBasic;

/**
 * This class are all about fundamental of arrays []
 */
public class ArrayMain {

	public static void main(String[] args) {
		
		/*
		 * ?? does the cars[] work? It work why
		 * it should be String[]??
		 */
		String cars[] = {"Toyota","Honda","Mazda"};
		System.out.print("String Arrays: ");
		//Index always starts at 0. Error out of bound if its car[3]
		System.out.println(cars[0]+", "+cars[1]+" ,"+cars[2]);
		
		int[] myNum = {10,20,30,40};
		System.out.print("Integer Arrays: ");
		System.out.println(myNum[3]);

		/*
		 * Changing value of an element
		 */
		System.out.println("Change the value of a specific element");
		cars[2] = "Nissan";
		System.out.println("Mazda to "+cars[2]);
		
		/*
		 * Length of the arrays
		 */
		System.out.println("There are: "+cars.length+" car brand");
		
		/*
		 * Loop Through an Array
		 */
		System.out.print("For Loop through cars: ");
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i]+", ");
		}
		
		/**
		 * For each on Array
		 */
		
		System.out.println();
		System.out.print("For each Loop: ");
		for(String car: cars) {
			System.out.print(car+", ");
		}
		
		/*
		 * Exercise Example
		 * - Create a program that calculate the 
		 * average of different ages
		 */
		
		/*
		 * A program that finds the lowest among ages
		 */
		
		/**
		 * Multidimensional Arrays
		 */
		
		int[][] myNumbers = {{1,2,3,4},
				 			 {5,6,7}};
		
		System.out.println();
		System.out.println("Multi array nummber: "+ myNumbers[1][1]);
		
		//Change the index number
		myNumbers[1][1] = 9;
		System.out.println("Multi array nummber: "+ myNumbers[1][1]);
		
		//Loop to Multi-Dimensional Array
		
		
		for(int a = 0; a < myNumbers.length; a++) {
			
			for(int b = 0;b < myNumbers[a].length;b++) {
				
				System.out.println(myNumbers[a][b]);
				
			}
			
		}
		
	}

}
