/**
 * @author Rustom Trayvilla
 * @since June 15, 1995
 * @version 1.0
 */
package DataStructure;
import java.util.LinkedList;

/*
 * Almost Similar to LinkedList.
 * Linkelist elements are store in a container in which container are connected to one another.
 * Use arrayList for sorting and accessing data, and LinkedList to manipulate data.
 */
public class JavaLinkedList {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Honda");
		
		System.out.println(cars);
		

	}

}
