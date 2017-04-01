import java.util.Scanner;

public class seven_fourteen {
	
	static final int SIZE = 5;

	public static void main(String[] args) {
		
		int[] numbers = new int[SIZE];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter five numbers: ");
		for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextInt();
		
		System.out.println("The gcd is " + gcd(numbers));
	}
	
	public static int gcd(int... numbers) {
		int gcd = 1;
		int min = getMin(numbers);
		int length = numbers.length - 1;
		
		int count = 0;
		for (int i = 2; i <= min; i++) {
			
			for (int k = 0; k <= length; k++) {
				if (numbers[k] % i == 0) {
					count++;
					if (count == length) gcd = i;
				} else {
					count = 0;
				}
			}
		}
		
		return gcd;
	}
	
	public static int getMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		
		return min;
	}

}
