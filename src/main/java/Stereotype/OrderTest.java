package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Stereotype/stereotypeconfig.xml");

		Order order = context.getBean("order", Order.class);

		System.out.println(order);
		System.out.println("Manu is :-" + order.getMenu());
		System.out.println("total amount" + order.getTotalbill());

	}

}
