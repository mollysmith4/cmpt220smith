
public class LinearEquation {
	/**Private data fields a, b, c, d, e, f*/
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	private double x;
	private double y;
	
	/**Constructor with the arguments for a, b, c, d, e, f*/
	LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF) {
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}
	
	/**Six getter methods*/
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	
	/**isSolvable method that returns true if ad - bc is not 0*/
	boolean isSolvable() {
		if ((a * d) - (b * c) != 0) {
			return true;
		}
		else {
			System.out.println("The solution is not possible");
			return false;
		}
	}
	
	/**Methods getX() and getY()*/
	public double getX() {
		x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		return x;
	}
	public double getY() {
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		return y;
	}
}
