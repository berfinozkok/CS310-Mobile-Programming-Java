package inter;

public interface IBank {
	String str = null; //varsayılan değer verilmesi gerekir.
	final String hostipAdd = "127.0.0.1";
	
	boolean connect(String ipAdd);
	boolean payment(double price, String cardNumber, String expireDate, String cvc);
	
}
