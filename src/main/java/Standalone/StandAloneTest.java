package Standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneTest {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("Standalone/config.xml");
		Village v = (Village) c.getBean("pname");
		System.out.println(v.getPersonename());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

		System.out.println(v.getVillagename());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

		System.out.println(v.getPopulation());

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

		System.out.println(v.getPersonename().getClass().getName());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

		System.out.println(v.getVillagename().getClass().getName());

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(v.getPopulation().getClass().getName());
	}

}
