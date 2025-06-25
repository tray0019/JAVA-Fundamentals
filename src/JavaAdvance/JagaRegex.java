/**
 * @author Rustom Trayvilla
 * @since June 20, 1995
 * @version 1.0
 */
package JavaAdvance;
import java.util.regex.Matcher; //Used to search for the pattern
import java.util.regex.Pattern; //Defines a pattern 
/*
 * ReGex is a squences of characters that form
 * a search pattern. E.G password etc.
 */
public class JagaRegex {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit W3Schools!");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
		
	}

}
