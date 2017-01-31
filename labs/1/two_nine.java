import java.util.Scanner;

public class two_nine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for data
		System.out.print("Enter v0, v1, and t: ");
		double startVelocity = input.nextDouble();
		double endVelocity = input.nextDouble();
		double time = input.nextDouble();
		
		//fulfill acceleration formula with data
		double acceleration = (endVelocity - startVelocity) / time;
		System.out.println("The average acceleration is " + acceleration);
		

	}

}
