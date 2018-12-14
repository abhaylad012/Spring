package Spring.Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.Question2.myclass.Question;

public class testQuestion2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Qusetion2.xml");
		
		Question question = (Question) context.getBean("answerBean");
		 
		question.answerPrint();
		 
		question.answer1Print();
		
		question.answer2Print();
		 
		question.answer3Print();
	}

}
