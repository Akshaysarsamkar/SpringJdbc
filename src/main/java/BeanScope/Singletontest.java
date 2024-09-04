package BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
     1] Singleton bean scope :- 
           a] it is by defualt bean scope
           b] create only single instance per spring loc container
           c] scope of bean define by two way 
               1] XML : 
                    <bean class="" name="" scope=""/>
                    
               2] Annotation :
                  with help of @scope annotation 
 */

//this example is releted to the annotation
public class Singletontest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope/beanscope.xml");

		Teacher teacher = context.getBean("teacher", Teacher.class);

		System.out.println(teacher.hashCode());

		Teacher teacher1 = context.getBean("teacher", Teacher.class);

		System.out.println(teacher1.hashCode());

	}

}
