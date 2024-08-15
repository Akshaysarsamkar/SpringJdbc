package Com.SpringCore.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Company c  =  (Company) context.getBean("company");
		
		System.out.println(c);
		System.out.println("Company name is " + c.getCompany_name() + " and Rank is " + c.getRank());

	}

}
