package thread;

public class Threadclass  implements Runnable{

	

	@Override
	public void run() {
		System.out.println("Thread started");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadclass cl= new Threadclass();
		Thread t= new Thread(cl);
		t.start();
		System.out.println("hi");
		

	}
}
