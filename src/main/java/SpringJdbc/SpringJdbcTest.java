package SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SpringJdbc.Dao.StudentDao;
import SpringJdbc.Dao.StudentDaoImpl;
import SpringJdbc.Entity.Student;

public class SpringJdbcTest {

	public static void main(String[] args) {
		System.out.println("wait a minute.............................");
		ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");
		StudentDao add = c.getBean("stu", StudentDao.class);

		Student student = new Student();
		student.setCity("pune");
		student.setId(11111);
		student.setStudentname("SAM KURAN");

		int res = add.addData(student);

		System.out.println(res);

//		// query
//		String query = "insert into stu(id,name,city) values(?,?,?)";
//
//		// fire query
//		int result = tem.update(query, 13, "Akshay kumar", "pune");
//		System.out.println("number of row affected when the query is fire " + result);

	}

}
