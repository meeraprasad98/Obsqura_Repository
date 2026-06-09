package superkeyword;

public class ConstructorChild extends ConstructorParent{

	public ConstructorChild(String name) {
		super("Tom");
		System.out.println("Inside Child Constructor " + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChild cc = new ConstructorChild("Jerry");
	}

}
