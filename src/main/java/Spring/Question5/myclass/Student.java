package Spring.Question5.myclass;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	int studentId;
	String studentName;
	String teacher;
	int age;
	
	
	public int getStudentId() {
		return studentId;
	}
	
	@Required
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	@Resource(name="studentBean1")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, String teacher, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.teacher = teacher;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", teacher=" + teacher + ", age=" + age + "]";
	}
}
