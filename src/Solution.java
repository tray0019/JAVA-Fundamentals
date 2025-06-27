import java.util.Scanner;


class Solution {
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5]; // array to store 5 numbers

        // Get input from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // read int and store it in array
        }

        // Print the array
        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.println(num);
        }
    	
    }
    
}