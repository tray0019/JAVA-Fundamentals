/**
 * @author Rustom Trayvilla
 * @since May 28, 2025
 * @version 1.0
 */
package Term1JavaLab;
import java.util.Scanner;

/**
 * This class represent the Main class for executing 
 * the Motorcycle program
 */
public class Program {

	public static void main(String[] args) {
		
		String textInput;
		int engineInput;
		Double numberInput;
		String report;
		
		Motorcycle motorcycle = new Motorcycle();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter vehicle identification number: ");
		textInput = scanner.nextLine();
		motorcycle.setVIN(textInput);
		
		System.out.println("Please enter Engine Size(cc): ");
		engineInput = scanner.nextInt();
		motorcycle.setEngineSize(engineInput);
		
		System.out.println("Please enter invoice price: ");
		numberInput = scanner.nextDouble();
		motorcycle.setInvoicePrice(numberInput);
		
		report = motorcycle.toString();
		
		System.out.println(report);
		System.out.println("Program By: Rustom Trayvilla");
		
		

	}

}
