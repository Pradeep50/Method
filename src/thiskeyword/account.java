package thiskeyword;

public class account {

	private long accountNo;
	private String name;
	private String email;
	private double amount;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	public static void main(String[] args) {

		account ac= new account();
		ac.setAccountNo(123456789);
		ac.setAmount(25000.35);
		ac.setEmail("PradeepPattar5045@gmail.com");
		ac.setName("Praeep");
		
	
	System.out.println(ac.getAccountNo()  + " " +  ac.getName()  +  " " + ac.getEmail() + " " +  ac.getAmount());
	}

	
}
