package SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SPELTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SPEL/spel.xml");

		Demo demo = context.getBean("demo", Demo.class);

		System.out.println(demo);

		
		//another way to create spring expression language 
		SpelExpressionParser expressionParser = new SpelExpressionParser();
		SpelExpression expression = (SpelExpression) expressionParser.parseExpression("87-45");
		System.out.println(expression.getValue());

	}

}
