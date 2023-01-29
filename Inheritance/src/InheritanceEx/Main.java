package InheritanceEx;

public class Main {

	public static void main(String[] args) {
		Employee e1= new Employee("halil kısacıkoğlu", "0453535", "examle@rmail");
		e1.login();
		Instructor i1= new Instructor("halil kısacık", "2345678", "email.com", "su", "prof");
		i1.logout();
		i1.logCourse();
		
		Employee m1= new Officer("halil ibo", "456789", "@bhcdjb", "inşaat müh", "12-13");
		//m1.workHard(); //alt class olduğu için oluyor
		
		Officer m2= new Officer("halil ibo", "456789", "@bhcdjb", "inşaat müh", "12-13");
		m2.workHard(); //alt class olduğu için oluyor
		
		TeachMember t1= new TeachMember("halil ibocan", "56787657", "@kjbsdxkjs", "pc müh", "16.00", "1765");
		t1.DoExam();
		
		Assistant a1= new Assistant("halil ibocan", "56787657", "@kjbsdxkjs", "pc müh", "assistant", "15.30-16.00");
		a1.DoQuiz();
		
		LabAssistant la= new LabAssistant("halil ibrahim", "54654675", "@ghvdchjb", "pc müh", "labassistant", "15.30-16.00");
		la.goLecture();
		
		InfoSystem it = new InfoSystem("halil ibrahim", "54654675", "@ghvdchjb", "it", "16.00", "Networking");
		it.NetworkMan();
		
		SecurityEmp se = new SecurityEmp("halil berf", "768976", "@jcbljhdbcf", "security", "16.00", "Watch");
		se.Watch();
		m1.login("13.00");
		i1.login();
		
		m2.login();
		
		//Polymorphizim olamsı için kalıtım olmak zorundadır. 
		//override edilmiş metotlara erişebilyorum
		Employee emp= new Instructor("halil kısacık", "2345678", "email.com", "su", "prof");
		emp.login();
		
		//int[] loginuser =new int[5];
		Employee[] loginuser = {i1};
		
		
	}
	

}
