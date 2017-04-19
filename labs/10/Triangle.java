public class Triangle extends GeometricObject {
	// Define variables
	double side1;
	double side2;
	double side3;
	double s;
	
	// Create Triangle Constructor
	Triangle() {
	}
	
	// Construct a Triangle Object 
	Triangle (double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Return side1, side2, and side3
	public double getSides() {
		return side1 + side2 + side3;
	}

	@Override
	public double getArea() {
		s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

}
