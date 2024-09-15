package CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		ApplicationContext c = new  ClassPathXmlApplicationContext("CI/ciconfig.xml");
		Person p  = (Person) c.getBean("person");
		System.out.println(p);
		
	}

}
