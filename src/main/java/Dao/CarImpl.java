package Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


import Entity.Car;

@Component
@ComponentScan(basePackages = "Dao")
public class CarImpl implements CarDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Car car) {
		String query = "INSERT INTO car (id,name,prize) value(?,?,?)";
		int r = this.jdbcTemplate.update(query, car.getCarid(), car.getCarName(), car.getPrize());
		return r;
	}

	@Override
	public int update(Car car) {
		String query = "UPDATE car SET name = ? where id = ? ";
		int r = this.jdbcTemplate.update(query, car.getCarName(), car.getCarid());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int delete(Car car) {
		String q = "delete from car where id = ?";
		int r = this.jdbcTemplate.update(q, car.getCarid());
		return r;
	}

	@Override
	public Car getcarinfo(int cid) {

		String q = "select * from car where id = ?";

		RowMapper<Car> rm = new RowMapperImpl();

		Car car = this.jdbcTemplate.queryForObject(q, rm, cid);

		return car;
	}

	public List<Car> getcarsinfo() {
		String q = "select * from car";

		RowMapper<Car> rm = new RowMapperImpl();

		List<Car> car = this.jdbcTemplate.query(q, rm);

		return car;

	}

}
