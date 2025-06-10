/**
 * @author Rustom Trayvilla
 * @since June 10, 1995
 * @version 1.0
 */
package JavaClass;

/*
 * Encapsulation make sure sensitive data is hidden from users. To achieve this, you must:
 * Declare class and viriables/attributes as private
 * provide public set and get method to access update the value of a private variable.
 */
public class Encapsulation {
	
	private String studentName;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
