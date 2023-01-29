package q1;

public class Letter implements Printable{
	public String sender;
	public String reciever;
	public String textContent;
	
	public Letter(String sender, String reciever,String textContext) {
		
		this.sender=sender;
		this.reciever = reciever;
		this.textContent = textContent;
	}
	public Letter(){
		super();
	}
	@Override
	public String getContent() {
		String str = "Letter [sender="+ this.sender +", reciever="+ this.reciever +", textContent"+ this.textContent + "\n";
		return str;
	}
	
}
