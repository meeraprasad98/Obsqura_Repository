package multilevelInheritance;

public class Father extends GrandFather{
	
	public void sub (int a, int b) {
		System.out.println("inside Father");
		int c = a - b;
		System.out.println("sub = " + c);
	}

}
