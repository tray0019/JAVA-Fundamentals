/**
 * @author Rustom Trayvilla
 * @since June 16, 1995
 * @version 1.0
 */
package DataStructure;
import java.util.HashMap;
/*
 * HashMap stores item in a key/value pairs.
 */
public class JavaHashMap {

	
	public static void main(String[] args) {
		
		HashMap<String,String> capitalCities = new HashMap<String,String>();
		
		/*
		 * To add item use put()
		 */
		capitalCities.put("Canada", "Ottawa");
		capitalCities.put("Philippines", "Manila");
		capitalCities.put("USA", "Washington");
		
		System.out.println(capitalCities);

		/*
		 * Access an item use get() method
		 */
		
		System.out.println("Philippines capital city is: "+capitalCities.get("Philippines"));
		
		/*
		 * Use remove() to remove an item or 
		 * to remove all use clear()
		 * size() - get the length of the elements
		 */
		
		/*
		 * Use keySet() if you only want the key
		 */
		
		for(String i: capitalCities.keySet()) {
			System.out.print(i+" ");
		}
		
		
	}

}
