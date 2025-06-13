/**
 * @author Rustom Trayvilla
 * @since June 11, 1995
 * @version 1.0
 */
package JavaClass;

/*
 * An enum is a special class that represent a group of constants(unchangeable variables, like final variables).
 * Enum are public, static and final. 
 * Enum cannot create object but can implement interface
 */
public class JavaEnum {

	/*
	 * Possible to have enum inside a class
	 */
	enum Level{
		LOW,MEDIUM,HIGH
	}
	
	public static void main(String[] args) {
		
		Level myEnum = Level.MEDIUM;
		System.out.println("1. "+myEnum);
		
		switch(myEnum) {
		
		case LOW:
			System.out.println("Low enum output");
			break;
			
		case MEDIUM:
			System.out.println("2. Medium enum output");
			break;
			
		case HIGH:
			System.out.println("High enum output");
			break;
		}
		
		for(Level myEnum1: Level.values()) {
			System.out.println(myEnum1);
		}
		
	}
	
	/*
	 * Instead of having final low, final medium, final high. Enum is a short-cut to that.
	 */
	
	
}
