
public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=" pradeep";
		String s2="PRADEEP";
		
		String s3= new String("Pradeep");
		String s4= "pattar";
		String s5=s1.concat(s4);
		System.out.println(s5);
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s3.compareTo(s1));
		
/*		String s = new StringBuilder().append("pradeep").append("pattar").toString();
		System.out.println(s);
*/
	}

}
