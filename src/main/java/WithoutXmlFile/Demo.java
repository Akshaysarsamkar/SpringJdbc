package WithoutXmlFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigDemo.class);
        
        Emp emp = context.getBean("getemp",Emp.class);
        System.out.println(emp);
	}
	
}
