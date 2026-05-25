package multilevelInheritance;

public class Son extends Father {
	
	public void divide(int a, int b) {
		System.out.println("inside Son");
		int c = a / b;
		System.out.println("division = " + c);
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.add(1, 2);
		s.sub(3, 1);
		s.divide(10, 2);
	}

}
