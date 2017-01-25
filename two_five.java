import java.util.Scanner;
public class two_five {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
		double realGratuity = gratuity * (1.0 / 10);
		double realTotal = subtotal + realGratuity;
		System.out.println("The gratuity is $" + realGratuity + 
				" and total is $" + realTotal);
	}

}
