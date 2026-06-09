package superkeyword;

public class MethodChild extends MethodParent{
	
	public void getName(String name) {
		System.out.println("Child Name : " + name);
		super.getName("Tom");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChild mc = new MethodChild();
		mc.getName("Jerry");
	}

}
