package inter;

public class ABank implements IBank{
	private String bankName;
	private String id;
	private String password;
	
	//Constructor
	public ABank(String bankName, String id, String password) {
		this.bankName=bankName;
		this.id = id;
		this.password = password;
	}
	@Override
	public boolean connect(String ipAdd) {
		System.out.println("User IP: " + ipAdd);
		System.out.println("Machine IP: " + this.hostipAdd);
		System.out.println(this.getName() + " connection is successfull.");
		return true;
	}
	@Override
	public boolean  payment(double price, String cardNumber, String expireDate, String cvc) {
		System.out.println("Transaction is successfull.");
		return true;
	}
	
	//getter setter methods 
	
	public String getName() {
		return this.bankName;
	}
	public void setName(String bankName) {
		this.bankName = bankName;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
