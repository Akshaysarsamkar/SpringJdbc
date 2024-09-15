package Stereotype;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueWithColletionTest {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Stereotype/stereotypeconfig.xml");
		
		ValueWithColletion valueWithColletion = (ValueWithColletion) context.getBean("ob");
		
		System.out.println(valueWithColletion.getList());
		System.out.println(valueWithColletion.getList().getClass().getName());
		
		
	}

}
