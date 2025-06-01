/**
 * @author Rustom Trayvilla
 * @since May 30, 2025
 * @version 1.1
 */
package JavaBasic;

/**
 * These class shows two ways to concatenate a String
 */
public class Concatonation {

	public static void main(String[] args) {
		
		String firstName = "Russ";
		String lastName = "Villa";
		
		
		System.out.println("Contcatonation with + ");
		System.out.println(firstName+" "+lastName);
		
		System.out.println("\nConcatonation with contact() method");
		System.out.println(firstName.concat(" "+ lastName));

	}

}
