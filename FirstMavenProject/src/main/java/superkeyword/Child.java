package superkeyword;

public class Child extends Parent {

	int age = 50;
	
	public void getAge() {
		System.out.println("Child Age : " + age);
		System.out.println("Parent Age : " +super.age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.getAge();
	}

}
