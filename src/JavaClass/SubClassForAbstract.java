/**
 * @author Rustom Trayvilla
 * @since June 10, 1995
 * @version 1.0
 */
package JavaClass;

/*
 * This is a sub class that extends to modifiers.
 */
public class SubClassForAbstract extends Modifiers {

	/*
	 * When extending to an abstract class, it must override the abstract method.
	 */
	@Override
	public void myAbstractSample() {
		
		System.out.println("Abstract class override!.");
		
	}

}
