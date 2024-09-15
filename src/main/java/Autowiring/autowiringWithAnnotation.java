package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowiringWithAnnotation {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Autowiring/config.xml");
		
		Owner o1 = (Owner) context.getBean("owner");
		
		System.out.println(o1);

	}

}
