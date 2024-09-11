package SpringJdbc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import SpringJdbc.Entity.Student;

public class StudentDao implements StudentDaoImpl {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int addData(Student stu) {
		String query = "insert into stu(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, stu.getId(), stu.getStudentname(), stu.getCity());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
