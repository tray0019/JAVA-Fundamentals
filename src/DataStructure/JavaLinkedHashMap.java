/**
 * @author Rustom Trayvilla
 * @since June 19, 1995
 * @version 1.0
 */
package DataStructure;
import java.util.LinkedHashMap;

/*
 * A LinkedHashMap stores keys and values, and keeps them in 
 * the same order you put them 
 */
public class JavaLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> capitalCities = new LinkedHashMap<>();
		capitalCities.put("USA","Washington" );
		capitalCities.put("Canada","Ottawa" );
		capitalCities.put("Philippines","Manila");
		capitalCities.put("Japan","Tokyo" );
		capitalCities.put("USA","Washington" );
		
		/*
		 * They are keep in same order they were added
		 */
		System.out.println(capitalCities);
		
		/*
		 * get(USA) - access its value pair
		 * remove() - remove element
		 * clear() - remove all item
		 * size() - count all paired elements
		 */
		
		for(String i: capitalCities.keySet()) {
			System.out.println(capitalCities.get(i)+" "+i);
		}

	}

}
