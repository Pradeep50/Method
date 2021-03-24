package thiskeyword;

public class abc {
	
	void m(){
		System.out.println("m");
	
	}
  void n(){
	  System.out.println("n");
	  this.m();
  }
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abc a= new abc();
		a.n();

	}

}
