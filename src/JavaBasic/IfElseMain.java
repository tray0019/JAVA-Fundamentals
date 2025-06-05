/**
 * @author Rustom Trayvilla
 * @since June 01-2, 2025
 * @version 1.0
 */
package JavaBasic;

/*
 *This class are for contidional statement
 *like If else, switch and while loop 
 */
public class IfElseMain {
	
	public static void main(String[] args) {
		
		int studentGrade = 71;
		
		if (studentGrade >98){
			System.out.println("A+ Student");
		}else if(studentGrade >95){
			System.out.println("A Student");
		}else if(studentGrade >90) {
			System.out.println("A- Student");
		}else if(studentGrade > 85) {
			System.out.println("B+ Student");
		}else if(studentGrade > 80) {
			System.out.println("B Student");
		}else if(studentGrade > 75) {
			System.out.println("B- Student");
		}else if(studentGrade > 70) {
			System.out.println("C+ student");
		}else if(studentGrade > 65) {
			System.out.println("C Student");
		}else if(studentGrade > 60) {
			System.out.println("C- Student");
		}else if(studentGrade > 55) {
			System.out.println("D+ Student");
		}else if(studentGrade>50) {
			System.out.println("D Student");
		}else {
			System.out.println("Fail");
		}
		
		/*
		 * Java short cute for if else condition
		 */
		
		/*
		 * This if statement prints out good day
		 * if the time is greater than 18.
		 * Otherwise it printout Good Evening
		 */
		int time = 20;
		if (time < 18) {
			System.out.println("Good Day");
		}else {
			System.out.println("Good Evening");
		}
		
		/*
		 * The short cut version for the above code
		 */
		
		String result = (time<18)?"Good Day!" : "Good Evening!";
		System.out.println("Short Cut code: "+result);
		
		
		/*
		 * A condition to find if the number is even or odd
		 */
		
		int myNum = 65;
		if(myNum % 2 ==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
		
		/**
		 * Java Switch statement. 
		 * It's similar to If Else but it
		 * makes the code shorter
		 */
		
		int day = 8;
		
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println();
			break;
			default:
				System.out.println("Out of date");
		}
		
		/**
		 * Java while loop. While loop loops through a block
		 * of code as long as a specified condition is true
		 */
		
		int i = 0;
		while(i < 5) {
			System.out.print(i+",");
			i++;
		}
		
		/**
		 * Do/While Loop. Similar to while loop
		 * but, it runs at least once until a 
		 * condition is true
		 */
		
		System.out.println();
		int x = 0;
		do {
			System.out.print(x+",");
			x++;
		} while(x<5);
		
		
		//Test create a count down program
		//Dice game
		
		/**
		 * Java for loop.
		 * Works the same as while loop but 
		 */
		System.out.println("\nFoor loop");
		for(int r =0; r<6;r++) {
			System.out.print(r);
		}
		
		//Fix formatting next time lol
		//Do nested for loop. It has outer loop and inner loop
		//Do multiplication table
		
		/**
		 * For-Each Loop.
		 * Use loop through elements in an array
		 */
		System.out.println("\nFor-each Loop");
		String[] cars = {"Volvo","BMW","Ford","Mazda"};
		for(String a : cars) {
			System.out.print(a+",");
		}
		
		
		/**
		 * Java Break statements. 
		 */
		System.out.println("Java break statements");
		for(int b =0;b<10;b++) {
			if (b==4) {
				break;
			}
			System.out.print(b+",");
		}
		
		/**
		 * Java Continue. Skips a value
		 * In the code below it skips the number 4
		 */
		System.out.println();
		System.out.println("Java Continue");
		for(int c = 0; c<10;c++) {
			if(c==4) {
				continue;
			}
			System.out.print(c+",");
		}
		
		/**
		 * Break and continue in while Loops
		 */
		System.out.println();
		System.out.println("While loop with break.");
		int d = 0;
		while(d<10) {
			System.out.print(d);
			d++;
			if (d==4) {
				break;
			}
		}
		System.out.println();
		System.out.println("While loop with continue.");
		int e = 0;
		while(e<10) {
			
			if (e==4) {
				e++;
				continue;
			}
			System.out.print(e);
			e++;
		}
		
	}

}
