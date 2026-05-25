package HierarchicalInheritance;

public class Daughter extends Father {
	public void daughterDetails(String name, int age) {
		System.out.println("inside Daughter");
		System.out.println("Daughter name : " + name);
		System.out.println("Daughter age : " + age);

	}

	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.fathersName("John");
		d.daughterDetails("Ria", 28);

	}

}
