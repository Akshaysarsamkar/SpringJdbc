package SpringLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
  A] life cycle of init 
         
         object is create
                |
              init()
                |
       other method need to run
                |
             destory()
             
   B] Life cycle with XMl file we use 2 attrubute to declare init and destory methods
           1] init-method :- mainly used to open database on web app
           2] destroy-method :- mainly used to close database of files
           
   c] we need to see the destroy method is working or not we use  AbstractApplicationContext  class registerShutdownHook method
   
              
 */

public class SpringLifeCycleTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext c = new ClassPathXmlApplicationContext("SpringLifeCycle/SLSconfig.xml");
		
		SpringLifeCycleWithXml ex  =(SpringLifeCycleWithXml) c.getBean("slc");
		
		System.out.println(ex);
		
		c.registerShutdownHook();

	}

}
