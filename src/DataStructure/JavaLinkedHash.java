/**
 * @author Rustom Trayvilla
 * @since June 19, 1995
 * @version 1.0
 */
package DataStructure;
import java.util.LinkedHashSet;

/*
 * A LinkedHashSet is a colelction that stores
 * unique elements and remembers the order
 * they were added.
 */
public class JavaLinkedHash {

	public static void main(String[] args) {
		
		LinkedHashSet<String> cars = new LinkedHashSet<>();
		
		cars.add("Toyota");
		cars.add("Hyundai");
		cars.add("Honda");
		cars.add("Mazda");
		cars.add("Toyota");
		/*
		 * Duplicate will be ignore
		 */
		System.out.println(cars);
		
		/*
		 * contains() check if it contains an element
		 * remove() remove an element
		 * clear() clear an element
		 * size() get all element
		 */
		
		for(String car: cars) {
			System.out.println(car);
		}
		
		
				

	}

}
