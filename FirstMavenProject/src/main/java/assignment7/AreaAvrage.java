package assignment7;

public class AreaAvrage {
	
	public void avrage(int a, int b , int c) {
		int avg = (a+b+c)/3;
		System.out.println("The avrage of 3 integer is : "+ avg);
	}
	
	public void avrage(float a, float b , float c) {
		float avg = (a+b+c)/3;
		System.out.println("The avrage of 3 float number is : "+ avg);
	}
	
	public void area(int radius) {
		double area = (radius*radius*Math.PI);
		System.out.println("The area of circle is : "+ area);
	}
	
	public void area(int l, int b, int h) {
		double area = (l*b*h);
		System.out.println("The area of rectangle is : "+ area);
	}
	
	public void area(float l) {
		double area = (l*l*l);
		System.out.println("The area of square is : "+ area);
	}

	public static void main(String[] args) {
		AreaAvrage aa = new AreaAvrage();
		aa.avrage(1, 2, 3);
		aa.avrage(2l, 3l, 5l);
		aa.area(4);
		aa.area(3, 4, 5);
		aa.area(3);

	}

}
