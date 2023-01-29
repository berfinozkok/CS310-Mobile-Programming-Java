package ClassInteraction;

public class Main {
	//Dependency, Composition, Inheritance
	public static void main(String[] args) {
		Student st1 = new Student("Berfin", "Özkök", "26407", "İstanbul", 80);
		Student st2 = new Student("ali", "Özkbbök", "26738", "İstanbul", 110);
		Student st3 = new Student("meka", "nmjnj", "d374", "İstanbul", 40);		
		System.out.println(st2.getNote());
		Instructor teacher = new Instructor("Halil", "Kısacıkoğlu", "CS");
		
		//Kalıtım is a 
		
		//composition, aggregation
		//Course has a Instructor (Sınıfın bir Öğretmeni vardır)
		Course math = new Course("MATH", "Math101", teacher);
		System.out.println(math.getInstructor().getName());
		
		
		//Student uses courses
		//Student[] stu = {st1, st2, st3};
		//System.out.println(math.calcAverage(stu));
	}
 
}
