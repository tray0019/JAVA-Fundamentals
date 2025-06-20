/**
 * @author Rustom Trayvilla
 * @since June 19, 1995
 * @version 1.0
 */
package DataStructure;
import java.util.TreeMap;
/*
 * A TreeMap is a collection that stores
 * key/value pairs in sorted order by key
 */
public class JavaTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> capitalCities = new TreeMap<>();
		
		capitalCities.put("USA","Washington" );
		capitalCities.put("Canada","Ottawa" );
		capitalCities.put("Philippines","Manila");
		capitalCities.put("Japan","Tokyo" );
		
		/*
		 * Countries are sorted alphabetically
		 */
		System.out.println(capitalCities);
		
		/*
		 * get(USA) - access its value pair
		 * remove() - remove element
		 * clear() - remove all item
		 * size() - count all paired elements
		 */
		
		for(String capital : capitalCities.keySet()) {
			System.out.println(capital+" "+capitalCities.get(capital));
		}

	}

}
