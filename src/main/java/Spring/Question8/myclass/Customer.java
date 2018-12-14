package Spring.Question8.myclass;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean,DisposableBean{
	
	int customerId;
	String customerName;
	long customerContact;

	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public Customer(int customerId, String customerName, long customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
	}
	public Customer() {
		
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", customerContact=" + customerContact;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean by interface implementing  into class ");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Bean by interface impleting into class");
		
	}
	
	public void myInit(){
		System.out.println("Initializing by user defined method");
	}
	
	public void myDestroy(){
		System.out.println("Destroying by user defined method");

	}

}
