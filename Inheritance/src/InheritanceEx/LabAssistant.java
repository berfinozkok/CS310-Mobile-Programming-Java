package InheritanceEx;

public class LabAssistant extends Assistant{
	public LabAssistant(String namesur, String tel, String email, String department, String unvan, String officetime){
		super(namesur, tel, email, department, unvan, officetime);
	}
	//get and set metots
	public void goLab() {
		System.out.println(this.getNameSur()+ " is doing lab.");
	}
	public void goLecture() {
		System.out.println(this.getNameSur()+ " is in the lecture.");
	}

}
