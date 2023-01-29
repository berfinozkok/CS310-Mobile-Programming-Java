package InheritanceEx;

public class Assistant extends Instructor{
	private String officetime;
	
	public Assistant(String namesur, String tel, String email, String department, String unvan, String officetime){
		super(namesur, tel, email, department, unvan);
		this.officetime= officetime;
	}
	//get and set metots
	public String getOfficeTime() {
		return this.officetime;
	}
	public void setOfficeTime(String officetime) {
		this.officetime= officetime;
	}
	
	public void DoQuiz() {
		System.out.println(this.getNameSur()+ " is doing quiz.");
	}
}
