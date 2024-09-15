package Dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Entity.Emp;

@Configuration
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

	@Override
	public Emp getemp(int id) {
		String q = "select * from Emp where id = ?";
		RowMapper<Emp> rowMapperImpl = new RowMapperImpl();
		Emp emp = this.jdbcTemplate.queryForObject(q,rowMapperImpl,id);
		return emp;
	}

}
