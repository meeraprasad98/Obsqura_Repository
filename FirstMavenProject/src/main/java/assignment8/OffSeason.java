package assignment8;

public class OffSeason {
	
	public void discount(double amount) {
		double discountAmount = amount*0.15;
		double finalPrice = amount-discountAmount;
		System.out.println("Final Price : " + finalPrice);
		System.out.println("Discount Amount : " + discountAmount);
	}

}
