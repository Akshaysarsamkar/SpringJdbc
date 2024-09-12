package Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import Entity.Emp;

public class EmpDaoImpl implements EmpDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int addEmp(Emp e) {

		String query = "insert into emp(id,name,address,salary) values (?,?,?,?)";
		int r = jdbcTemplate.update(query, e.getEmpid(), e.getEmpname(), e.getAddress(), e.getSalary());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
