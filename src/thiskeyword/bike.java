package thiskeyword;

abstract class bike {

	public void bike() {
		System.out.println("bike is created");
	}

	void gearChange() {
		System.out.println("ghear changed");
	}

	abstract void run();
}

class honda extends bike {

	void run() {

		System.out.println("running successfully");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bike b = new honda();
		b.run();
		b.gearChange();

	}

}