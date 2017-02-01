import java.util.Scanner;

public class four_twenty {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println("The length of " + s + " is " + s.length() +
				" and the first character is " + s.charAt(0));

	}

}
