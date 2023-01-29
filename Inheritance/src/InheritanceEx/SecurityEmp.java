package InheritanceEx;

public class SecurityEmp extends Officer{
	private String document;
	
	public SecurityEmp(String namesur, String tel, String email, String department, String shift, String document){
		super(namesur, tel, email, department, shift);
		this.document= document;
	}
	//get and set metots
	public String getDoc() {
		return this.document;
	}
	public void setDoc(String document) {
		this.document= document;
	}
	
	public void Watch() {
		System.out.println(this.getNameSur()+ " is at the Night watch.");
	}
}
