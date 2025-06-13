/**
 * @author Rustom Trayvilla
 * @since June 11, 1995
 * @version 1.0
 */
package JavaClass;
//Imported all the methods
import java.time.*;
import java.time.format.DateTimeFormatter;

/*
 * There are built in classes for Dates and time API.
 */
public class JavaDates {
	
	public static void main(String[] args) {
		
		//Display current date
		LocalDate localDate = LocalDate.now();
		System.out.println("Date is: "+localDate);
		
		//Display current time
		LocalTime localTime = LocalTime.now();
		System.out.println("Time is: "+localTime);
		
		//Display current date and time
		LocalDateTime localDT = LocalDateTime.now();
		System.out.println("Local date and time is: "+localDT);
		
		//Format Date and Time
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = dtFormatter.format(localDT);
		System.out.println("After Formatting: "+formattedDate);
		
	}

}
