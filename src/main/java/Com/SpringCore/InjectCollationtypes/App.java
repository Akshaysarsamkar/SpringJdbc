package Com.SpringCore.InjectCollationtypes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("config.xml");
		
		Emp e  = (Emp) context.getBean("emp1");
		System.out.println(e);
		System.out.println();
		
		System.out.println("list of mails is :");
		
		List<String> m  =  e.getMails();
		
		for(String a : m) {
			System.out.println(a);
		}
		

	}

}
