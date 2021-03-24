package enump;

enum Student {

	NAME, EAMIL, ADDRESS;

	public static void main(String[] args) {
		

		for (Student s : Student.values()) {
			System.out.println(s);
		}

		//System.out.println(Student.valueOf("NAME"));
		//System.out.println(Student.valueOf("NAME").ordinal());
		//System.out.println(Student.valueOf("ADDRESS").ordinal());
		//System.out.println(Student.valueOf("EMAIL").ordinal());
	}

}
  