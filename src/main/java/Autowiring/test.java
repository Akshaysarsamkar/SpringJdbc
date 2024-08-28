package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowiring/config.xml");
		Candidate s = (Candidate) context.getBean("can",Candidate.class);
		System.out.println(s);
	}

}