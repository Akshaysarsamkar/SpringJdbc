package SpringJdbc.com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate bean = context.getBean("jdbcTemp", JdbcTemplate.class);

		Collage collage = new Collage();
		collage.setAddress("pune");
		collage.setCname("bjs");
		collage.setId(123);

		String q = "insert into collage(cid,cname,address) values (?,?,?)";

		int i = bean.update(q,12,"2fdsdf","Fsdfs");
		
		System.out.println(i);
		
	}
}
