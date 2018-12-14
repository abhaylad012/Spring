package Spring.Assignment1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.Question1.myclass.Customer;

public class testQuestion8 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Question8.xml");
		context.registerShutdownHook();
		
		Customer customer = (Customer) context.getBean("customerBean");
	}

}
