package assignment9;

public class Contractor extends Employee {
	
	double payment;
	int noOfHours;

	public Contractor(double payment, int noOfHours) {
		this.payment = payment;
		this.noOfHours = noOfHours;
	}

	@Override
	public void calculateSalary() {
		double salary = payment * noOfHours;
		System.out.println("Salary of the Contractor is : " + salary);
	}

	public static void main(String[] args) {
		Employee contractor = new Contractor(1000, 5);
		contractor.calculateSalary();
	}

}
