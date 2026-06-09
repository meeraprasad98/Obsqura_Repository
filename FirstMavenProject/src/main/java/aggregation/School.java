package aggregation;

public class School {
	
	int c;
	int d;
	Student std;
	
	public School(int c, int d, Student std) {
		this.c = c;
		this.d = d;
		this.std = std;
	}
	
	public void show() {
		System.out.println("a is " + std.a);
		System.out.println("b is " + std.b);
		System.out.println("c is " + c);
		System.out.println("d is " + d);
	}

	public static void main(String[] args) {
		Student std = new Student(1, 2);
		School sch = new School(3, 4, std);
		sch.show();
	}

}
