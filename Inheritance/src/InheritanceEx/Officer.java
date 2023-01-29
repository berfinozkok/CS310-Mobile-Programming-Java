package InheritanceEx;

public class Officer extends Employee{
	private String department;
	private String shift;
	//kalıtım aldığın constructorını kendi içinde yazmak zorundasın.
	public Officer(String namesur, String tel, String email, String department, String unvan) {
		super(namesur, tel, email); //super çalışan sınıfın constructorını gösterir, ilk bunu yaz
		this.department=department;
		this.shift= shift;		
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getShift() {
		return this.shift;
	}
	public void setShift(String shift) {
		this.shift=shift;
	}
	public void workHard() {
		System.out.println(this.getNameSur() + " is working.");
	}
	@Override
	public void login() {
		System.out.println(this.getNameSur() + " C kapısından giriş yaptı");
	}
}
