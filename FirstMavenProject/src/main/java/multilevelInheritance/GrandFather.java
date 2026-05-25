package multilevelInheritance;

public class GrandFather {

	public void add(int a, int b) {
		System.out.println("Inside GrandFather");
		int c = a + b;
		System.out.println("Add = " + c);
	}
}
