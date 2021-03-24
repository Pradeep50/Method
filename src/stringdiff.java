
public class stringdiff {

	
	public static String concatString()
	{
		String s="Pradeep";
		for(int i=0; i<100; i++){
			s=s+"pattar";
		}
		return s;
	}
	
	public static String Stringbuffer(){
		
		StringBuffer bf= new StringBuffer("Pradeep");
		for(int i=0; i<100; i++){
			bf.append("pattar");
		}
		
		
		return bf.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime=System.currentTimeMillis();
		concatString();
		System.out.println("time taken by string " + (System.currentTimeMillis()-startTime) + "ms");

		startTime=System.currentTimeMillis();
		Stringbuffer();
		System.out.println("time taken by buffer " + (System.currentTimeMillis()-startTime) + "ms");
	}

}
