
public class Student {
	
	int rollNo;
	String name;
	String City;
	
	

	public Student(int rollNo, String name, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		City = city;
	}

	


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", City=" + City + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(101,"Raj","lucknow");  
		   Student s2=new Student(102,"Vijay","ghaziabad");  
		 
		 System.out.println(s1);
		 System.out.println(s2);
	}

}
