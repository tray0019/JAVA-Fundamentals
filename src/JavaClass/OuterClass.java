/**
 * @author Rustom Trayvilla
 * @since June 10, 1995
 * @version 1.0
 */
package JavaClass;
/*
 * Nesting a class to group classes that belong together.
 */
public class OuterClass {

	String OuterClass = "This String is in outer class. ";
		
	class InnerClass{
		String innerClass = "This string is in InnerClass. ";	
	} //InnerClass can be private unlike regular class
	
}
