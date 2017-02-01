import java.util.Scanner;

public class four_nine {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for a character
		System.out.print("Enter a character: ");
		
		String a = input.nextLine();
		char ch = a.charAt(0);
		if (a.length() == 1) {
			System.out.println("The Unicode for the character " + ch + " is " + a.codePointAt(0) );
		
		}
		
		
	}

}
