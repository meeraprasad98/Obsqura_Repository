package assignment7;

public class Student {

	int maths;
	int english;
	int science;

	public Student(int maths, int english, int science) {
		this.maths = maths;
		this.english = english;
		this.science = science;
	}

	public int totalMarks() {
		int total = maths + science + english;
		return total;
	}

	public void getGrade(int totalMarks1) {
		if (totalMarks1 > 270) {
			System.out.println("The grade of student is A");
		} else if (totalMarks1 > 240) {
			System.out.println("The grade of student is B");
		} else if (totalMarks1 > 210) {
			System.out.println("The grade of student is C");
		} else {
			System.out.println("The grade of student is D");
		}
	}

	public static void main(String[] args) {
		Student st1 = new Student(80, 70, 85);
		int totalMarks1 = st1.totalMarks();
		st1.getGrade(totalMarks1);

		Student st2 = new Student(92, 93, 95);
		int totalMarks2 = st2.totalMarks();
		st2.getGrade(totalMarks2);

	}

}
