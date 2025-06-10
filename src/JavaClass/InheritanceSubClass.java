/**
 * @author Rustom Trayvilla
 * @since June 10, 1995
 * @version 1.0
 */
package JavaClass;

public class InheritanceSubClass extends InheritanceSuperClass{

	public void childMethod() {
		System.out.println("Child Method!");
	}
	
	public static void main(String[] haha) {
		
		InheritanceSubClass child = new InheritanceSubClass();
		
		/*
		 * Printing child method aswell as parent method
		 */
		child.childMethod();
		child.parentMethod();
		
		
	}
	
}
