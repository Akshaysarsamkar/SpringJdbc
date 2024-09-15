package Com.SpringCore.InjectCollationtypes;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetApp {

	public static void main(String[] args) {
		
		ApplicationContext c =  new ClassPathXmlApplicationContext("config.xml");
		
		SetExample ex = (SetExample) c.getBean("setex");
		
		System.out.println(ex);
		
		Set<String> p = ex.getPhone();
		
		Iterator<String> s = p.iterator();
		
		System.out.println("With iterator");
		
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		System.out.println();
		System.out.println("with for loop");
		for(String e : p) {
			System.out.println(e);
		}
		
	}


}
