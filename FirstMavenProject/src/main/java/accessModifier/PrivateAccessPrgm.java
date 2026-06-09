package accessModifier;

public class PrivateAccessPrgm {
	private void getName(String name)
	{
		System.out.println("In Private access modifier " + name);
	}

	public static void main(String[] args) {
		PrivateAccessPrgm obj = new PrivateAccessPrgm();
		obj.getName("meera");
		
	}

}
