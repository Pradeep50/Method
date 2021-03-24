
public class string {

	public static void main(String[] args) {
		
		String str=" i am Pradeep pattar";
		
		int count =0;
		
		int strlength=str.length();{
		
		for(int i=0; i<=str.length()-1; i++){
		/*Integer i= Integer.valueOf(s);
		//int i= Integer.parseInt(s);
		 */ 
			if(str.charAt(i)=='p'){
				count++;
			}
			
		System.out.println(str.length());
		
		}
		
		System.out.println("count is  " +count);
		
		//System.out.println(i+100);
		//System.out.println(s+100);
	
		
		char ch= str.charAt(12);
		
		System.out.println(ch);
		
		System.out.println(str.substring(4, 9));
	}

	}
    

}
