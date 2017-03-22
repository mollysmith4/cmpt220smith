
public class ten_three {
	
	public static void main(String[] args) {
		MyInteger n1 = new MyInteger(7);
		System.out.println("n1 is even? " + n1.isEven());
		System.out.println("n1 is prime? " + n1.isPrime());
		System.out.println("35 is prime? " + MyInteger.isPrime(35));
		
		char[] chars = {'2', '4', '2', '8'};
		System.out.println(MyInteger.parseInt(chars));
		
		String s = "3539";
		System.out.println(MyInteger.parseInt(s));
		
		MyInteger n2 = new MyInteger(28);
		System.out.println("n2 is odd? " + n2.isOdd());
		System.out.println("45 is odd? " + MyInteger.isOdd(45));
		System.out.println("n1 is equal to n2? " + n1.equals(n2));
		System.out.println("n1 is equal to 7? " + n1.equals(7));
	}
}

class MyInteger {
	int value;
	
	MyInteger(int newValue) {
		value = newValue;
	}
	
	public int getValue() {
		return value;
	}
	
	public static boolean isEven(int n) {
		return (n % 2 == 0);
	}
	
	public static boolean isOdd(int n) {
		return (n % 2 != 0);
	}
	
	public static boolean isPrime(int n) {
		for (int f = 2; f < n / 2; f++) {
			if (n % f == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger n) {
		return n.isEven(n);
	}
	
	public static boolean isOdd(MyInteger n) {
		return n.isOdd(n);
	}
	
	public static boolean isPrime(MyInteger n) {
		return n.isPrime(n);
	}
	
	public boolean isEven() {
		return isEven(value);
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	public boolean equals(int n) {
		return (value == n);
	}
	
	public boolean equals(MyInteger n) {
		return equals(n.getValue());
	}
	
	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}
	
	public static int parseInt(char[] s) {
		return parseInt(new String(s));
	}
}
