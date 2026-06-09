package assignment7;

public class Reverse {
	
	int number;

	public Reverse() {
		System.out.println("Finding Reverse...");
	}

	public Reverse(int number) {
		this();
		this.number = number;
		System.out.println("The given number is : " + number);
		StringBuilder sb = new StringBuilder(String.valueOf(number)).reverse();
		System.out.println("The reverse is : " + sb);
		
	}

	public static void main(String[] args) {
		Reverse rev = new Reverse(123);
	}

}
