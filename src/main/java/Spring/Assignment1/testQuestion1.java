package Spring.Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.Question1.myclass.Customer;

public class testQuestion1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Question1.xml"); 
		
		Customer customer = (Customer)context.getBean("customerBean");
		System.out.println(customer);
		
		Customer customer1 = (Customer)context.getBean("customerBean1");
		System.out.println(customer1);
	}

}
