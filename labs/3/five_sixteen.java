import java.util.Scanner;

public class five_sixteen {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	int num = input.nextInt();
	
	input.close();
	
	for (int i = 2; i <= num;) {
		if (num % i == 0) {
			System.out.print(i + " ");
			num /= i;
		}
		else {
			i++;
		}
	}
	}
	}
		
		