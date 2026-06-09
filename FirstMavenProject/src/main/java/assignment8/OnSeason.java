package assignment8;

import java.util.Scanner;

public class OnSeason extends OffSeason{
	
	@Override
	public void discount(double amount) {
		double discountAmount = amount*0.40;
		double finalPrice = amount-discountAmount;
		System.out.println("Final Price : " + finalPrice);
		System.out.println("Discount Amount : " + discountAmount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
        System.out.print("Please Enter Total Amount ");
        double price = scanner.nextDouble(); 
        
        System.out.println("Do yo need offSeaon or Onseason Discount");
        System.out.println("Enter 1 for OnSeason");
        System.out.println("Enter 2 for OffSeason");
        int option = scanner.nextInt(); 
        
        if(option == 1) {
        	OnSeason onSeason = new OnSeason();
        	onSeason.discount(price);
        }else if(option == 2) {
        	OffSeason offSeason = new OffSeason();
        	offSeason.discount(price);
        }else {
        	System.out.println("Wrong Input");
        }
        scanner.close(); 
	}

}
