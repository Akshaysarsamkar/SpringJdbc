package Dao;

import java.util.List;

import Entity.Car;

public interface CarDao {

	public int insert(Car car);

	public int update(Car car);

	public int delete(Car car);

	public Car getcarinfo(int cid);
	
	public List<Car> getcarsinfo();

}
