/**
 * @author Rustom Trayvilla
 * @since June 20, 1995
 * @version 1.0
 */

package JavaAdvance;

class GenericBox<T >  {

	/*
	 * <T extends Number>
	 * This extension will only work with numeric 
	 * Data Type
	 */
	
	T value; //T is a placeholder for any data type
	
	void set(T value) {
		this.value = value;
	}
	
	T get() {
		return value;
	}
	
	public static <T> void printArray(T[] array) {
		for (T item: array) {
			System.out.println(item);
		}
	}
}
