/**
 * @author Rustom Trayvilla
 * @since June 10, 1995
 * @version 1.0
 */
package JavaClass;

/*
 * This is a Parent class. 
 * Any methods or attributes in this class
 * can be inhereted by any subclass.
 */
public class InheritanceSuperClass {

	//Notice setting this to private wont be accesible to any subclass. Change to Protected.
	private String parentAttribute   = "Super Class Attribute";
	
	public void parentMethod() {
		System.out.println("Parent Class Method");
	}
	
	
	
}
