/**
 * @author Rustom Trayvilla
 * @since June 10, 1995
 * @version 1.0
 */
package JavaClass;

/*
 * Access modifiers is a term that can be use in Java to access attributes, classes, methods and constructors.
 * Access Modifiers - controls the access level
 * Non-Access Modifiers - do not access level, but provides other functionality
 */
public abstract class Modifiers {
	
	/*
	 * In these two attributes example we have an email that set public to be access
	 * and a private that cannot be access.
	 */
	public String email = "test@email.com";
	private String password = "Password123";
	//Code is accessible in the same package and subclasses. 
	protected int userId = 01;
	//Default only acceptable in the same package.
	String thisDefault = "This is a default modifier.";
	
	/*
	 * Non-access modifiers are final and abstract.
	 * Final cannot be inherited by other class.
	 * Abstract cannot be use to create object
	 */
	
	/*
	 * Other non-access like transient, synchronize and volatile 
	 */
	
	
	/*
	 * Final - Cannot be override
	 */
	final double PI = 3.14;
	/*
	 * Static - Can be access without creating object
	 */
	static void myStaticMethod() {
		System.out.println("Hello Static!");
	}
	/*
	 * Abstract - Does not have a body. Body is provided by the subclass.
	 * The class must be abstract to create abstract method. 
	 */
	public abstract void myAbstractSample();
	
	
	
	
	
}
