package InheritanceEx;

public class Instructor extends Employee{
	private String department;
	private String unvan;
	//kalıtım aldığın constructorını kendi içinde yazmak zorundasın.
	public Instructor(String namesur, String tel, String email, String department, String unvan) {
		super(namesur, tel, email); //super çalışan sınıfın constructorını gösterir, ilk bunu yaz
		this.department=department;
		this.unvan= unvan;		
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getUnvan() {
		return this.unvan;
	}
	public void setUnvant(String unvan) {
		this.unvan=unvan;
	}
	public void logCourse() {
		System.out.println(this.getNameSur() + " derse giriş yaptı.");
	}
	@Override
	
	//Ata sınıfımızdan aldığımız metotları kendi içerisinde geçersiz yapabiliriz.
	public void login() {
		System.out.println(this.getNameSur() + " instructor A lapısından giriş yaptı.");
	}
}
