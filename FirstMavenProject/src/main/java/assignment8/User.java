package assignment8;

import java.util.Scanner;

public class User {
	
	public int getPin() {
		Scanner scanner = new Scanner(System.in); 
        System.out.print("Please Enter ATM pin ");
        int age = scanner.nextInt(); 
        scanner.close(); 
        return age;
	}

}
