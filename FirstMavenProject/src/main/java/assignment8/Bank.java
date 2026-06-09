package assignment8;

public class Bank {
	
	public int getPin() {
		User user = new User();
		int pin = user.getPin();
		return pin;
	}
	
	public void validatePin(int pin) {
		if(pin == 1001 || pin == 1234 || pin == 1212) {
			System.out.println("Please Collect Cash");
		}else {
			System.out.println("The pin number you have entered is incorrect");
		}
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		int pin = bank.getPin();
		bank.validatePin(pin);
	}

}
