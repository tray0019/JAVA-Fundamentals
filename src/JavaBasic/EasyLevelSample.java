package JavaBasic;

/*Level 2
 * 
 * This class code a simple program of a combination of variables, data type and simple syntax.  
 * This class program a student records with different data types;
 * 
 */
public class EasyLevelSample {

	public static void main(String[] args) {
		
		//Tom Student info
		String studentName = "Tom";
		int studentID = 001;
		double studentOverallGrade = 77.7;
		float studentMoney = 1111.11f;
		char studentGrade = 'c';
		boolean studentStatus = true;
		
		System.out.println("Student Present: " + studentStatus);
		System.out.println("Student Name: "+ studentName);
		System.out.println("Student ID: "+studentID);
		System.out.println("Student Grade: "+ studentGrade);
		System.out.println("Student Overall Grade: "+ studentOverallGrade);
		System.out.println("Student Cash: "+ studentMoney);
		
		//Simple math calculation
		int length = 4;
		int width = 5;
		int area;
		
		area = width * length;
		
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("Area: "+area);
		

	}

}
