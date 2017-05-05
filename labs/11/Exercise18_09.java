import java.util.Scanner;

public class Exercise18_09 {
	public static void main(String[] args) {
		//Prompt user for string
		System.out.print("Enter a string: ");
		
		//Create new scanner
		String value = new Scanner(System.in).nextLine();
		reverseDisplay(value);
	}
	
	private static void reverseDisplay(String value) {
		if (value.length() == 0)
			return;
		System.out.print(value.substring(value.length() - 1));
		reverseDisplay(value.substring(0, value.length() - 1));
	}

}
