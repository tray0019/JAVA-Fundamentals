/**
 * @author Rustom Trayvilla
 * @since June 18, 1995
 * @version 1.0
 */
package DataStructure;
import java.util.HashSet;

/*
 * A HashSet is a collection of elements where 
 * every elements is unique.
 */
public class JavaHashSet {

	public static void main(String[] args) {
		

		HashSet<String> userName = new HashSet<String>();
		
		userName.add("tom01");
		userName.add("tom02");
		userName.add("tom03");
		userName.add("tom04");
		userName.add("tom01");
		System.out.print(userName+" ");
		System.out.println();
		/*
		 * Check if wether the element exist
		 * in a hashset
		 */
		System.out.println("Does it exist? "+ userName.contains("tom5"));
		
		/*
		 * remove() to remove an element
		 * clear() remove all elements
		 * size() count how many elements
		 */
		
		System.out.println("How many username: " + userName.size());
		
		HashSet<Integer> myNum = new HashSet<Integer>();
		myNum.add(64);
		myNum.add(5);
		myNum.add(77);
		myNum.add(235);
		
		for(int i = 1;i <= 500; i++) {
			if(myNum.contains(i)) {
				System.out.println(i + " Found. ");
			} else {
				System.out.println(i+"Nothing was found. ");
			}
		}
			
		
	}

}
