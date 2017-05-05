import java.util.Scanner;

public class Exercise18_11 {
	public static void main(String[] args) {
			//Create new scanner
			Scanner input = new Scanner(System.in);
			
			//Prompt user for input
			System.out.print("Enter an integer: ");
			long n = input.nextLong();
			System.out.println(sumDigits(n));
	}
	
	public static long sumDigits(long n) {
		if (n == 0)
			return n;
		
		return n % 10 + sumDigits(n / 10);
	}

}
