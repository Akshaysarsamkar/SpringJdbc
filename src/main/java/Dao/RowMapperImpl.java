package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

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
	}

}
