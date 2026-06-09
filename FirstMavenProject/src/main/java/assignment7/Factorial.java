package assignment7;

public class Factorial {

	int factorial;

	private void findFactorial(int number) {
		int sum = 1;
		for (int i = 1; i <= number; i++) {
			sum = sum * i;
		}
		factorial = sum;
		this.printResult();
	}

	private void printResult() {
		System.out.println("The factorial of given number is : " + factorial);
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		fact.findFactorial(5);

	}

}
