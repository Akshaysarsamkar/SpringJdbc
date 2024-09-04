package BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
       prototype bean scope :
          1] create new bean instance every time request for that specific bean is made 
          2] two way to configure the bean scope 
                a] xml 
                b] annotation
 */

public class PropertyXmlTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope/beanscope.xml");

		Car car = context.getBean("car", Car.class);

		System.out.println(car.hashCode());

		Car car1 = context.getBean("car", Car.class);

		System.out.println(car1.hashCode());
	}

}
