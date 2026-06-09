package test;

public class ConstructorOverloading {
	
	public ConstructorOverloading() {
		System.out.println("Constructor 1");
	}
	
	public ConstructorOverloading(String s1) {
		System.out.println("Constructor 2 "+s1);
	}
	
	public ConstructorOverloading(int s2) {
		System.out.println("Constructor 3 "+ s2);
	}
	
	public ConstructorOverloading(String s1, int s2) {
		System.out.println("Constructor 4 " + s1 + " " + s2);
	}

	public static void main(String[] args) {

		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co1 = new ConstructorOverloading("Tom");
		ConstructorOverloading co2 = new ConstructorOverloading(1);
		ConstructorOverloading co3 = new ConstructorOverloading("tom",1);
	}

}
