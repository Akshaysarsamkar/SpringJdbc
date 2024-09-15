package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Entity.Car;

public class RowMapperImpl implements RowMapper<Car> {

	@Override
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {

		Car car = new Car();
		car.setCarid(rs.getInt(1));
		car.setCarName(rs.getString(2));
		car.setPrize(rs.getFloat(3));

		return car;
	}

}
