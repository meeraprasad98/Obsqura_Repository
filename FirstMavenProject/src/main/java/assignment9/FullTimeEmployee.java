package assignment9;

public class FullTimeEmployee extends Employee {

	double payment;
	int noOfHours;

	public FullTimeEmployee(double payment) {
		this.payment = payment;
		this.noOfHours = 8;
	}
	
	@Override
	public void calculateSalary() {
		double salary = payment * noOfHours;
		System.out.println("Salary of the Full time employee is : " + salary);
	}

	public static void main(String[] args) {
		Employee FullTimeEmployee = new FullTimeEmployee(1000);
		FullTimeEmployee.calculateSalary();
	}

}
