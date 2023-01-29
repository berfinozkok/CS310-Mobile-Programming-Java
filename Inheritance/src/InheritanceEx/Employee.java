package InheritanceEx;

public class Employee {
	private String namesur;
	private String tel;
	private String email;
	
	public Employee(String namesur, String tel, String email) {
		this.namesur =namesur;
		this.tel=tel;
		this.email= email;
	}
	
	
	//getter ve setter motedolar
	public String getNameSur() {
		return this.namesur;
	}
	public void setNameSur(String namesur) {
		this.namesur=namesur;
	}
	
	public String gettel() {
		return this.tel;
	}
	public void settel(String tel) {
		this.tel=tel;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void login() {
		System.out.println(namesur + " You logged in!");
	}
	
	//metot overloading
	public void login(String entertime) {
		System.out.println(namesur + " You logged in!");
	}
	public void logout() {
		System.out.println(namesur + " You logged out!");
	}
	public void lunch() {
		System.out.println(namesur + " Lunch Time!");
	}
	public static void loggedin(Employee[] loginUsers) {
		for(Employee e:loginUsers) {
			e.login();			
		}
	}
}
