package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    1] Autowiring concept is used to inject object automaticall into the other class 
    2] with the help of auto wiring we can not inject primitive datatype and collection datatype
    3] autowiring can be done with 
         a]xml := when we use xml use different mode like byname,bytype,constructor etc.
         2]annotation : used @autowired annotation
    4] Advantages := 
         a] require write less code 
    5]disadvantages:=     
         a] not inject string and collection datatype    
 */

public class AutowiringWithXml {
	
	public static void main(String args[]) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("Autowiring/config.xml");
	    Student s = (Student) context.getBean("Collage");
	    System.out.println(s);
	}

}
