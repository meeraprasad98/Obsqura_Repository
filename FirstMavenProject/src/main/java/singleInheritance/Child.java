package singleInheritance;

public class Child extends Parent{
	
	public void show() {
		System.out.println("Child class inherits parent");
	}

	public static void main(String[] args) {
		 
		Child child = new Child();
		child.add(1, 2);
		child.show();
	}

}
