package InheritanceEx;

public class InfoSystem extends Officer{
	private String duty;
	
	public InfoSystem(String namesur, String tel, String email, String department, String shift, String duty){
		super(namesur, tel, email, department, shift);
		this.duty= duty;
	}
	//get and set metots
	public String getDuty() {
		return this.duty;
	}
	public void setOfficeTime(String duty) {
		this.duty= duty;
	}
	
	public void NetworkMan() {
		System.out.println(this.getNameSur()+ " is works on Networking");
	}
}
