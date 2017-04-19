import java.util.Scanner;

public class Exercise13_1 {
	/** Main method */
	public static void main(String[] args) {
		// Create a new scanner
		Scanner input = new Scanner (System.in);
		
		// Create a new triangle
		GeometricObject triangle1 = new Triangle();
		
		// Prompt user to enter three sides of a triangle
		System.out.print("Enter three sides of a triangle: ");
		double[] sides = new double[3];
		for (int i = 0; i < sides.length; i++) {
			sides[i] = input.nextDouble();
		}
		
		// Prompt the user to enter triangle color
		System.out.print("Enter a triangle color: ");
		String color = input.next();
		
		// Prompt the user to enter boolean for filled triangle
		System.out.print("Is the triangle filled? true/false: ");
		String isFilledString = input.next();
		boolean isFilled = (isFilledString.equals("true"));
		
		// Display triangle
		Triangle t1 = new Triangle(sides[1], sides[1], sides[1]);
		t1.setColor(color);
		t1.setFilled(isFilled);
		System.out.println("Triangle 1: ");
		System.out.println("Area = " + t1.getArea());
		System.out.println("Perimeter = " + t1.getPerimeter());
		System.out.println("Color = " + t1.getColor());
		System.out.println("Is filled? " + t1.isFilled());
		
		
	}

}
