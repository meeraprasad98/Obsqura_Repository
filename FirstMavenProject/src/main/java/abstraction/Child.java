package abstraction;

public class Child extends Parent{
	
	public void showDetails()
	{
		System.out.println("inside child method");
	}
	
	 public static void main(String[] args) {
		 Child obj = new Child();
		 obj.addNum();
		 obj.add();
		 obj.showDetails();
		 
 }

	@Override
	public void addNum() {
		System.out.println("Inside Child class override");
		
	}

}
