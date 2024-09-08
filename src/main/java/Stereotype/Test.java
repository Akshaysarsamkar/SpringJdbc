package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    1] we can do configration without xml for thid perpose used diffrent annoation 
       A] @configaration  
           1] it is class level annotation
           2] mainly used to replece xml configration file traditionally
           3] used to indicate that an object is source of bean definitions 
           
        B] @Bean :
           1] it is method level annotation 
           2] it we indicate method will be return object that should be registered as bean
           
        c] ComponentScan(basepackage="")
           1] used alongside @configaration annotation
           2] indicate package that we want to scanned
 */

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Stereotype/stereotypeconfig.xml");

		Student student = context.getBean("student", Student.class);

		System.out.println(student);
	}

}
