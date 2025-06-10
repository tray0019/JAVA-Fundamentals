/**
 * @author Rustom Trayvilla
 * @since June 10, 1995
 * @version 1.0
 */

package JavaClass;

//This is a built-in JDE package that's imported to use the Scanner class
import java.util.Scanner;
import JavaBasic.JavaMethodMain;
/*
 * User can directly use other Package and their class with the use of Import.
 */
public class ImportPackage {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//.close() one of the scanner method. 
		scan.close();
		
		/*
		 * Use of JavaMethodMain
		 */
		
		JavaMethodMain testImport = new JavaMethodMain();
		System.out.println("Testing Import Package method: ");
		testImport.testMethod();
		
	}

}
