package SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SPEL/spel.xml");

		StaticMethodAndVariable staticMethodAndVariable = context.getBean("spel", StaticMethodAndVariable.class);

		System.out.println(staticMethodAndVariable);
		System.out.println(staticMethodAndVariable.hashCode());

		System.out.println(" +===================================================================================+ ");

		StaticMethodAndVariable staticMethodAndVariable1 = context.getBean("spel", StaticMethodAndVariable.class);

		System.out.println(staticMethodAndVariable1);
		System.out.println(staticMethodAndVariable1.hashCode());

	}

}
