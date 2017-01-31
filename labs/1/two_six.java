import java.util.Scanner;

public class two_six {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter integer
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		//
		int lastDigit = number % 10;
		int remainingNumber = number / 10;
		int secondLastDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int thirdLastDigit = remainingNumber % 10;
		
		//Add the digits together
		int sum = lastDigit + secondLastDigit + thirdLastDigit;
		
		//Results
		System.out.println("The sum of all digits in " + number 
				+ " is " + sum);
		


	}

}
