
public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb= new StringBuffer();
		//sb.append("Pattar");
		
		System.out.println(sb.capacity());
		
		sb.append("Pradeep");
		System.out.println(sb.capacity());
		sb.append("java is my favorite language");
		System.out.println(sb.capacity());
		/*sb.insert(2, "pattar");
		
		System.out.println(sb.reverse());*/

	}

}
