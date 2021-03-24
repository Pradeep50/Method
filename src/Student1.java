
public class Student1 {

	int id;
	String name;
	
	static String college = "Vdrit";
	
	

	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	void display(){
		System.out.println(id  + ""  +  name  +  ""  +  college);
	}

	public static void main(String[] args) {
		
		Student1 st1= new Student1(21,"Pradeep");
		Student1 st2= new Student1(22,"Kiran");
		
		st1.display();
		st2.display();
	
	

}
}