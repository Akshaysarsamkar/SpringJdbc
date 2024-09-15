package SpringLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleWithInterfaceTest   {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringLifeCycle/SLSconfig.xml");
		
		LifeCycleWithInterface ex1 = (LifeCycleWithInterface) context.getBean("interface");
		
		System.out.println(ex1);
		
		context.registerShutdownHook(); // used to run the destory method		
		
	}

}
