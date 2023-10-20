package calculatorapp_main;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2;
		System.out.println("Enter the first Number: ");
		num1 = input.nextDouble();
		System.out.println ("Enter the second Number: ");
		num2 = input.nextDouble();
		
		System.out.println("Select an Operation: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		int choice = input.nextInt();
		
		double result = 0; //Initialize Result
		
//		Choice
		
		switch (choice) {
		case 1 :
			result = num1 + num2;
			break;
		case 2 :
			result = num1 - num2;
			break;
		case 3 :
			result = num1 * num2;
			break;
		case 4 :
			if (num2 != 0) {
			result = num1 / num2;
			}else {
				System.out.println ("Division By Zero Is Not Allowed");
				return;
			}
			break;
		default: 
			System.out.println("Invalid Choice");
			return; //Exit the program

		}
		
		System.out.println("Result: " + result);
		
//		Another Calculation
		System.out.println("Do you want to perform another calculation? (yes/no): ");
		String answer = input.next().toLowerCase();
		
		if (!answer.equals("yes")) {
			System.out.println("Task Completed. Emptying Stack!!");
			
		}
	}
}
