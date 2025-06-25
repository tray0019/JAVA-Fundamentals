/**
 * @author Rustom Trayvilla
 * @since June 19, 1995
 * @version 1.0
 */

package JavaAdvance;

/*
 * Generics allow user to write classes, interface,
 * and methods that work with different data types,
 * without having to specify the exact type in advance
 */
public class JavaGenerics {

	public static void main(String[] args) {
		

		//Create Box to hold string
		GenericBox<String> stringBox = new GenericBox<>();
		stringBox.set("Hello");
		System.out.println("Value: "+stringBox.get());
		
		//Creating box that hold int
		GenericBox<Integer> intBox = new GenericBox<>();
		intBox.set(64);
		System.out.println("Value: "+intBox.get());
		
		//Array of String
		String[] name = {"L", "Light", "Near"};
		
		//Array of Integer
		Integer[] myNum = {64, 2025, 1995};
		
		GenericBox.printArray(name);
		GenericBox.printArray(myNum);
		
		
		/*
		 * ArrayList and HashMap use generics
		 * Generic can be applied to classes, 
		 * method and interface
		 */
		
	}

}
