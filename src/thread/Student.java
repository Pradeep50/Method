package thread;

public class Student {

	int studentId;
	String name;
	double fees;

	public Student(int studentId, String name, double fees) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.fees = fees;
	}

	public void display() {
		System.out.println("studentId=" + studentId + ", name=" + name + ", fees=" + fees + "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(11, "Pradeep", 3455.50);
		Student s2 = new Student(21, "patar", 4990.35);
		s1.display();
		s2.display();

	}

}
