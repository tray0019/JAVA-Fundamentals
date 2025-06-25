/**
 * @author Rustom Trayvilla
 * @since June 20, 1995
 * @version 1.0
 */
package JavaAdvance;

/*
 * Allows a programt to operate by doing multiple things
 * at the same time.
 */
public class JavaThreads extends Thread {
	
	public void run() {
		System.out.println("This code is running. ");
	}
	
	public void runSecond() {
		System.out.println("This code run the second method?");
	}

}
