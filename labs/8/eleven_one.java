import java.util.Scanner;
public class eleven_one {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides of a triangle: ");
		double[] sides = new double[3];
		for (int i = 0; i < sides.length; i++) {
			sides[i] = input.nextDouble();
		}
		
		System.out.print("Enter a triangle color: ");
		String color = input.next();
		System.out.print("Is the triangle? true/false: ");
		String isFilledString = input.next();
		boolean isFilled = (isFilledString.equals("true"));
		
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
