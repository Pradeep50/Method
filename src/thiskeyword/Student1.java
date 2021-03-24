package thiskeyword;

public class Student1 {

	private int id;
	private String name;

	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try{
		Student1 s1= new Student1(24, "pradeep");
		Student1 s2= (Student1)s1.clone();
		
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
		
	}
catch(CloneNotSupportedException c){
	}
	}

}
