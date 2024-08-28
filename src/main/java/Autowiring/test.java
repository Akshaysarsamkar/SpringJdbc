package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowiring/config.xml");
		Student s = (Student) context.getBean("stu",Student.class);
		System.out.println(s);
	}

}
