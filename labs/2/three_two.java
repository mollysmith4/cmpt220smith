import java.util.Scanner;

public class three_two {

	public static void main(String[] args) {
		//Generate three random single-digit integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"What is " + number1 + " + " + number2 + " + " + number3 + "?");
		
		int answer = input.nextInt();
		
		System.out.println(
				number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + 
						(number1 + number2 + number3 == answer));
						

	}

}
