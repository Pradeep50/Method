package thiskeyword;

interface vehicle {
	
	 static void speed(){
		
	}
	
	public class car implements vehicle{
	
		public void speed(){
			System.out.println(" car is running");
		}
	}

	public static void main(String[] args){
		
		vehicle a= new car();
		a.toString();
		
	}
}
