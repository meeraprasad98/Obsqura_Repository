package HierarchicalInheritance;

public class Son extends Father {

	public void sonDetails(String name, int age) {
		System.out.println("inside Son");
		System.out.println("Son name : " + name);
		System.out.println("Son age : " + age);

	}

	public static void main(String[] args) {
		Son s = new Son();
		s.fathersName("John");
		s.sonDetails("Rayan", 35);

	}

}
