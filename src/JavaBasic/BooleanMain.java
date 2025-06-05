/**
 * @author Rustom Trayvilla
 * @since June 01, 2025
 * @version 1.1
 */
package JavaBasic;

/*
 * This class are all about many ways 
 * to execute a Boolean
 */
public class BooleanMain {

	public static void main(String[] args) {
	
		//Boolean from a variables
		boolean lightON = true;
		System.out.println("Is the light on? "+lightON);
		boolean computerIsHack = false;
		System.out.println("Is the computer hack? "+computerIsHack);
		
		/*
		 * Boolean can be returned from boolean expressions,
		 * for conditional testing
		 */
		
		int x = 64;
		int y = 24;
		System.out.println("Is x greater than y? "+(x>y));
		System.out.println("Another short cut: 64 < 24"+(64<24));
		//More examples
		System.out.println("Compare two data: "+(x == 64));
		System.out.println(x==24);
		
		/*
		 * Some real world examples
		 */
		int myAge = 18;
		int legalAlcoholAge = 19;
		
		System.out.println("Are you allowed to drink alcohol? ");
		if(myAge > 19) {
			System.out.println("You can drink alcohol.");
		} else {
			System.out.println("No, You are still young.");
		}
		
		
		
		
	}

}
