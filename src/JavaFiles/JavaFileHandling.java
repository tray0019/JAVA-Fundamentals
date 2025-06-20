/**
 * @author Rustom Trayvilla
 * @since June 19, 1995
 * @version 1.0
 */
package JavaFiles;
import java.io.File; //import file class
import java.io.IOException; //Class to handle eror
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

/*
 * The File classs from java.io
 * allows user to work with files
 */
public class JavaFileHandling {

	public static void main(String[] args) {
		File myObj = new File("filename.txt");
		/*
		 * Get File Information
		 */
		
		if(myObj.exists()) {
			
			System.out.println("File Name"+myObj.getName());
			System.out.println("Writable: "+myObj.canWrite());
			System.out.println("Readable: "+myObj.canRead());
			System.out.println("File Size: "+myObj.length());
			
		}else {
			System.out.println("File not found");
		}
		
		/*
		 * File calss has many useful method
		 * 
		 * canRead() - Boolean type if file is readable or not
		 * canWrite() - Boolean, whether the file is writable
		 * createNewFile - Boolean, create new file
		 * delete() - delete a file
		 * exist() - Boolean, test if file exist
		 * getName() - String, Returns the name of the file
		 * getAbsolutePath() - String, Returns file path
		 * length() - return file size in bytes
		 * list() - return array of the filles in the dir
		 * mkdir() - Boolean - creates a directory
		 */
		
		
		/*
		 * Create the file
		 */
		try {	
			
			if(myObj.createNewFile()) {
				System.out.println("File created: "+myObj);
			}else {
				System.out.println("File already exist. ");
			}
			
			System.out.println("File: "+myObj.getAbsolutePath());
		
		} catch(IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
			
		/*
		 * Write a file
		 */
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Test FileWriter.");
			myWriter.close(); // close FileWriter
			System.out.println("Succesful? I didn't close.");
			
		}catch(IOException e) {
			System.out.println("An error occured. ");
			e.printStackTrace();
		}
		
		/*
		 * Reading File using scanner
		 */
		try {
			
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println("File Data: "+data);
			}
			
			myReader.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}
		
		/*
		 * delete() - delete a file
		 * or folder
		 */

	}

}
