/**
 * @author Rustom Trayvilla
 * @since June 06, 2025
 * @version 1.0
 */
package JavaClass;

/**
 * Java is an object oriented programming.
 * It associates with class and objects.
 */
public class ClassAndObject {

	int a = 1;
	
	public static void main(String[] args) {
		
		ClassAndObject myObject = new ClassAndObject();
		System.out.println("This will print out a value "+myObject.a);
		
		//Multiple Object is possible
		ClassAndObject myObject2 = new ClassAndObject();
		System.out.println("Print our object 2 value "+myObject2.a);
		
	}

}
