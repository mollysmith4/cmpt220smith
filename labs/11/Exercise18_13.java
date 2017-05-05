import java.util.Scanner;

public class Exercise18_13 {
	public static void main(String[] args) {
		//Create new array
		int[] array = new int[8];
		
		//Create new scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter 8 integers: ");
		
		//Create for loop for array
		for (int i = 0; i < array.length; i++)
			array[i] = input.nextInt();
		
		System.out.println("The largest number is " + getLargest(array));
	}
	
	private static int getLargest(int[] array) {
		return getLargest(array, 0, array[0]);
	}
	
	private static int getLargest(int[] array, int i, int high) {
		if (i == array.length)
			return high;
		
		if (high < array[i])
			high = array[i];
		
		return getLargest(array, i + 1, high);
	}

}
