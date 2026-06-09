package polyMorphisam;

public class ComplieTimePolPgm1 {

	public void addNum() {
		System.out.println("Without parameter addnum");
	}
	
	public void addnum(int a, int b) {
		int c = a+b;
		System.out.println("Sum with 2 munber is " + c);
	}
	
	public void addNum(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("Sum with 3 munber is " + d);
	}
	
	public static void main(String[] args) {
		ComplieTimePolPgm1 cp = new ComplieTimePolPgm1();
		cp.addNum();
		cp.addnum(1, 2);
		cp.addNum(1, 2, 3);
	}

}
