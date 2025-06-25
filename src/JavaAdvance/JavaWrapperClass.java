/**
 * @author Rustom Trayvilla
 * @since June 19, 1995
 * @version 1.0
 */
package JavaAdvance;

/*
 * Wrapper classes provide a way to use primitive data types
 * as objects
 */
public class JavaWrapperClass {

	public static void main(String[] args) {
		
		Integer intWrap = 64;
		Double doubleWrap = 64.99;
		Boolean booWrap = true;
		Character cWrap = 'T';
		
		System.out.print(intWrap+" "+doubleWrap+" "+booWrap+" "+cWrap);
		System.out.println();
		/*
		 * Wrapper are objects that has method.
		 * The 3 was added instead of calculated
		 */
		System.out.println("Integer: "+intWrap.intValue()+3);
		
		/*
		 * Turn Integer into a string
		 */
		String myString = intWrap.toString();
		System.out.println(myString.length());
	}

}
