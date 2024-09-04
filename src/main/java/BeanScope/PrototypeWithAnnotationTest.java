package BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeWithAnnotationTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope/beanscope.xml");

		Village v1 = context.getBean("village", Village.class);

		System.out.println(v1.hashCode());

		Village v2 = context.getBean("village", Village.class);

		System.out.println(v2.hashCode());
	}

}
