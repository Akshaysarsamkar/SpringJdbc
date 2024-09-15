package ref;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Collage c = (Collage) context.getBean("col");
		
		System.out.println(c);
		
		System.out.println("Student name " + c.getStu().getName() + " studying at " + c.getCname());
		
		
	}
}
