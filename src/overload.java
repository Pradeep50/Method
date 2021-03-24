
public class overload {

	static int mul(int a , int b)
	{
	return a*b;
	}
	
	static int sub(int a, int b){
		return a-b;
	}
	
	static int add(int a, int b, int c){
		return a+b+c;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(overload.mul(11,15));
		System.out.println(overload.sub(34, 56));
		System.out.println(overload.add(12,23,45));
	}

}
