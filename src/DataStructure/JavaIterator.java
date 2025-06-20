/**
 * @author Rustom Trayvilla
 * @since June 19, 1995
 * @version 1.0
 */
package DataStructure;
import java.util.Iterator;
import java.util.ArrayList;

/*
 * An Iterator is an object that can be used to loop through
 * collections, like ArrayList and HashSet.
 */
public class JavaIterator {

	public static void main(String[] args) {
		//create collection
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Toyota");
		cars.add("Hyundai");
		cars.add("Honda");
		cars.add("Mazda");
		
		//Get the iterator
		Iterator<String> it = cars.iterator();
		
		/*
		 * This print the first item - Toyota
		 */
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
