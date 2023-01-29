package ClassInteraction;

public class Course {
	private String courseName;
	private String code;
	private Instructor instructor;
	
	//constructor
	public Course(String courseName, String code, Instructor instructor){
		this.courseName=courseName;
		this.code = code;
		this.instructor = instructor;
	}
	//getter metods and setter metods
	
	public String getcourseName() {
		return this.courseName;
	}
	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getcode() {
		return this.code;
	}
	public void setcode(String code) {
		this.code = code;
	}
	public Instructor getInstructor() {
		return this.instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public double calcAverage(Student[] students) {
		double average = 0;
		for(int i=0; i < students.length; i++) {
			average += students[i].getNote();
		}
		return average/students.length;
	}

}
