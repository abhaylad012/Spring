package Spring.Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import Spring.Question5.myclass.Student;

public class testQuestion5 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Question5.xml");
		
		Student student = (Student) context.getBean("studentBean1");
		System.out.println(student);
		
	}

}
