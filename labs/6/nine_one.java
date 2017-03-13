
public class nine_one {
	/**Main method*/
	public static void main(String[] args) {
	//Create a rectangle with width 1 and height 1
		SimpleRectangle rectangle1 = new SimpleRectangle();
		System.out.println("The area of the rectangle of width " + 
				rectangle1.width + " and height " + rectangle1.height
				+ " is " + rectangle1.getArea() + " and the perimeter is " 
				+ rectangle1.getPerimeter());
		
	//Create a rectangle with width 4 and height 40
		SimpleRectangle rectangle2 = new SimpleRectangle(4, 40);
		System.out.println("The area of the rectangle of width " +
				rectangle2.width + " and height " + rectangle2.height
				+ " is " + rectangle2.getArea() + " and the perimeter is "
				+ rectangle2.getPerimeter());
	
	//Create a rectangle with width 3.5 and height 39.5
		SimpleRectangle rectangle3 = new SimpleRectangle(3.5, 39.5);
		System.out.println("The area of the rectangle of width " +
				rectangle3.width + " and height " + rectangle3.height
				+ " is " + rectangle3.getArea() + " and the perimeter is "
				+ rectangle3.getPerimeter());
	}
}

//Define the rectangle class with two constructors
class SimpleRectangle {
		double width;
		double height;
		
		/**Construct a rectangle with width 1 and height 1 */
		SimpleRectangle() {
			width = 1;
			height = 1;
		}
		
		/**Construct a rectangle with a specified width and height */
		SimpleRectangle(double newWidth, double newHeight) {
			width = newWidth;
			height = newHeight;
		}
		
		/**Return the area of this rectangle */
		double getArea() {
			return width * height;
		}
		
		/**Return the perimeter of this circle */
		double getPerimeter() {
			return 2 * (width + height);
		}
}
