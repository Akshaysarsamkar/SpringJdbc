package MVCSpringJdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.CarDao;
import Entity.Car;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		CarDao res = context.getBean("cardao", CarDao.class);

		// Insert operation
//		Car car = new Car();
//		car.setCarid(79);
//		car.setCarName("BMW");
//		car.setPrize(52.54f);

//		int i = res.insert(car);
//		System.out.println(i);

		// Update operation
//		Car car2 = new Car();
//		car2.setCarid(12);
//		car2.setCarName("Panch Ev");
//
//		int r = res.update(car2);
//		System.out.println(r);

		// delete operation
//		Car c3 = new Car();
//		c3.setCarid(79);
//
//		int delete = res.delete(c3);
//		System.out.println(delete);

		// select query
//		Car getcarinfo = res.getcarinfo(12);
//		System.out.println(getcarinfo);

		
		
		List<Car> cars = res.getcarsinfo();
		System.out.println(cars);
		
		for(Car car : cars) {
			System.out.println(car.getCarid());
			System.out.println(car.getCarName());
			System.out.println(car.getPrize());
			System.out.println("====================================================");
		}
	}

}
