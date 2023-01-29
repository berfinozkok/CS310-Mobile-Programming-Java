package InheritanceEx;

public class TeachMember extends Instructor{
	private String doorNumber;
	public TeachMember(String namesur, String tel, String email, String department, String unvan, String doorNumber) {
		super(namesur, tel, email, department,unvan);
		this.doorNumber = doorNumber;
	}
	public String getdoorNumber() {
		return this.doorNumber;
	}
	
	public void setdoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	
	public void Meeting() {
		System.out.println(this.getNameSur() +" is at the meeting..");
	}
	public void DoExam() {
		System.out.println(this.getNameSur() +" is doing the exam.");
	}
}
