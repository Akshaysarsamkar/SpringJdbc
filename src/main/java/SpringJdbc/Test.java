package SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.EmpDao;
import Entity.Emp;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Springjdbc.xml");
		EmpDao res = context.getBean("empdao", EmpDao.class);

		Emp emp = new Emp();

		emp.setAddress("pune");
		emp.setEmpid(1);
		emp.setEmpname("Akshaykumar");
		emp.setSalary(52f);

		int r = res.addEmp(emp);
		System.out.println(r);

	}

}
