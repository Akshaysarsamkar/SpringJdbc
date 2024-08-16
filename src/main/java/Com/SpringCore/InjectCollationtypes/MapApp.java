package Com.SpringCore.InjectCollationtypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapApp {

	public static void main(String[] args) {
		
		
		ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");
		
		MapExample m =  (MapExample) c.getBean("mapex");
		
		System.out.println(m);
		
	}

}
