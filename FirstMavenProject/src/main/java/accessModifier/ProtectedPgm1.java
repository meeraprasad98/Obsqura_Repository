package accessModifier;

public class ProtectedPgm1 {

	protected void getName(String name) {
		System.out.println("Inside Protected Method " + name);
	}
	
	public static void main(String[] args) {
		ProtectedPgm1 pg = new ProtectedPgm1();
		pg.getName("Jim");
	}
}
