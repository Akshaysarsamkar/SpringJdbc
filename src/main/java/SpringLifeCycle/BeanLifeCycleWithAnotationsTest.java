package SpringLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleWithAnotationsTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringLifeCycle/SLSconfig.xml");
		
	    BeanLifeCycleWithAnotations ex1 = (BeanLifeCycleWithAnotations)context.getBean("annotation");
	    
	    System.out.println(ex1);
	    
	    context.registerShutdownHook();

	}

}
