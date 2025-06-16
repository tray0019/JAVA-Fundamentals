/**
 * @author Rustom Trayvilla
 * @since June 15, 1995
 * @version 1.0
 */
package DataStructure;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList is a resizable array that can grow as needed.
 * Allow to store elements and access them by index. 
 * ArrayList allows add or remove.
 */
public class JavaArrayList {

	public static void main(String[] args) {
		
		/*
		 * Adding method to ArrayList
		 */
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Honda");
		
		System.out.println("Cars: "+cars);
		
		cars.add(1, "Added Hyundai on index 1");
		System.out.println(cars);
		
		/*
		 * Access an item
		 */
		
		System.out.println("Access Index 1: "+cars.get(1));
		
		/*
		 * Modify index
		 */
		
		cars.set(1, "Index 1 is modified");
		System.out.println("Index is modified: "+cars.get(1));
		
		/*
		 * Remove an item
		 */
		cars.remove(1);
		System.out.println("Index 1 was deleted: "+cars);
		
		/*
		 * Get index size
		 */
		System.out.println("There are "+cars.size()+" cars.");
		
		/*
		 * Loop through an ArrayList
		 */
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		/*
		 * For each loop
		 */
		System.out.println("For each loop: ");
		for(String car: cars) {
			System.out.println(car);
		}
		
		/*
		 * Elements in a nArrayLists are objects.
		 * When using int you must use wrapper class 
		 * which would be <Integer>
		 */
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
			myNumbers.add(2020);
			myNumbers.add(2021);
			myNumbers.add(2022);
			myNumbers.add(2023);
			myNumbers.add(2024);
			
			System.out.println("Wrapper Integer ");
			for(int myNum: myNumbers) {
				System.out.println(myNum);
			}
			
			/*
			 * Sorting an Array
			 */
			System.out.println("Sorting an Array: ");
			Collections.sort(cars);
			for(String car: cars) {
				System.out.println(car);
			}
			
			/*
			 * Find out how to remove all in the ArrayList
			 */

	}

}
