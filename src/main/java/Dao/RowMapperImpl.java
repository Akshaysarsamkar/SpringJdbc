package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

<<<<<<< HEAD
import Entity.Car;

public class RowMapperImpl implements RowMapper<Car> {

	@Override
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {

		Car car = new Car();
		car.setCarid(rs.getInt(1));
		car.setCarName(rs.getString(2));
		car.setPrize(rs.getFloat(3));

		return car;
=======
import Entity.Emp;

public class RowMapperImpl implements RowMapper<Emp> {

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {

		Emp emp = new Emp();
		emp.setEmpid(rs.getInt(1));
		emp.setEmpname(rs.getString(2));
		emp.setAddress(rs.getString(3));
		emp.setSalary(rs.getFloat(4));

		return emp;
>>>>>>> 8e34aeeb9801121e01b51332f36d546e26bbda54
	}

}
