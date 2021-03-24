package thiskeyword;

interface printable {
	void print();

}

interface showable {
	void show();
}

class xyz implements printable, showable {

	public void show() {
		System.out.println("hello");

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		xyz a = new xyz();
		a.show();
		a.print();
	}
}