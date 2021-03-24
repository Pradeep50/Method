
public class Demo {

	public static void main(int a)//overload main method but method signature should be different
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main method invoked");
		main(6);
	}

}
