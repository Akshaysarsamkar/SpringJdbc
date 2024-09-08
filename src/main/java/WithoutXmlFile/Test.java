package WithoutXmlFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		teacher teacher = context.getBean("geTeacher", teacher.class);

		System.out.println(teacher);
	}

}
