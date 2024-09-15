package BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class singletonwithxmltest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope/beanscope.xml");

		Student student = context.getBean("student", Student.class);

		System.out.println(student.hashCode());

		Student student1 = context.getBean("student", Student.class);

		System.out.println(student1.hashCode());
	}

}
