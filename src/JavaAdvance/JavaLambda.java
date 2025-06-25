/**
 * @author Rustom Trayvilla
 * @since June 23, 1995
 * @version 1.0
 */
package JavaAdvance;
import java.util.ArrayList;
import java.util.function.Consumer;
/*
 * A lambda expression is a short block of code
 * which takes in parameters and returns a value.
 * Lambda works like a method but does not 
 * require a name.
 */

public class JavaLambda {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		numbers.add(8);
		numbers.add(2);
		
		/*
		 * Lambda example
		 */
		numbers.forEach( (n) -> {
			System.out.print(n+" ");
		});
		
		/*
		 * Lambda can be stored in a variables type
		 * only of interface which has one method
		 */
		Consumer<Integer> method = (n) -> {
			System.out.println(n);
		};
		System.out.println();
		numbers.forEach(method);
		
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello",ask);

	}

	
	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}


}

