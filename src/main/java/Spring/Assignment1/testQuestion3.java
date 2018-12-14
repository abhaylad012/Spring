package Spring.Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.Question3.myclass.BankAccountController;

public class testQuestion3 {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Question3.xml");
		
		BankAccountController bank = context.getBean(arg0);
		
	}
}
