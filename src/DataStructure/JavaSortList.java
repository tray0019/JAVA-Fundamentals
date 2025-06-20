/**
 * @author Rustom Trayvilla
 * @since June 16, 1995
 * @version 1.0
 */
package DataStructure;
import java.util.Collections; //collection might be static
import java.util.ArrayList;

/*
 * Collections is a data structure that has method like 
 * sort, reverse the order etc.
 */
public class JavaSortList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myNum = new ArrayList<Integer>();
		myNum.add(234);
		myNum.add(325);
		myNum.add(123);
		myNum.add(563);
		myNum.add(64);
		
		Collections.sort(myNum);
		for(int i: myNum) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		Collections.sort(myNum, Collections.reverseOrder());
		for(int a: myNum) {
			System.out.print(a+" ");
		}
		
		/*
		 * And many more method to use Collection
		 */
		
	}
}
