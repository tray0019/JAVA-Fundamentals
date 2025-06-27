/**
 * @author Rustom Trayvilla
 * @since June 18, 2025
 * @version 1.0
 */
package DataStructure;
import java.util.TreeSet;

/*
 * TreeSet is a collection that stores unique
 * elements in sorted order
 */
public class JavaTreeSet {
	
	public static void main(String[] args) {
		TreeSet<String> cars = new TreeSet<>();
		
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Hyundai");
		cars.add("Mazda");
		cars.add("BMW");
		
		/*
		 * The elements are sorted automatically
		 * Duplicates arend allowed.
		 * Slower than hashset due to sorting
		 */
		System.out.println(cars);

		/*
		 * containt() checks if element exist
		 * remove() remove an element
		 * clear() remove all
		 * size() get all elements
		 */
	}

}
