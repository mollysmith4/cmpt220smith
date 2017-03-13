import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a number for each variable
		System.out.println("Enter a number for each of the following variables: a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		//Create a Linear Equation
		LinearEquation le1 = new LinearEquation(a, b, c, d, e, f);
		le1.isSolvable();
		le1.getX();
		le1.getY();
		System.out.println("The value of x is " + le1.getX() + " and the value of y is " 
				+ le1.getY());

	}

}
