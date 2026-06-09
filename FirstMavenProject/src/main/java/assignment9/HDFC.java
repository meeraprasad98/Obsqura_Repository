package assignment9;

public class HDFC implements RBI {

	@Override
	public void recurringDeposit(double amount, int duration) {
		double intrest = intrestRate / 100;
		double finalAmount = 0;
		int noOfYears = duration;

		// simple interest
		for (int i = 0; i < duration; i++) {
			double eachYearAmount = amount + (amount * noOfYears * intrest);
			finalAmount = finalAmount + eachYearAmount;
			noOfYears = noOfYears - 1;
		}

		System.out.println("Maturity Amount After " + duration + " years is " + finalAmount);
	}

	public static void main(String[] args) {
		RBI hdfc = new HDFC();
		hdfc.recurringDeposit(1000, 5);
	}

}
