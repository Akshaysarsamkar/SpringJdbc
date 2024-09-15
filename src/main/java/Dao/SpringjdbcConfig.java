package Dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringjdbcConfig {

	@Bean("data")
	public DataSource getConnection() {

		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setPassword("root");
		data.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		data.setUsername("root");
		data.setDriverClassName("com.mysql.cj.jdbc.Driver");

		return data;
	}

	@Bean("jdbcTemp")
	public JdbcTemplate jdbcTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		jdbcTemplate.setDataSource(getConnection());

		return jdbcTemplate();
	}

//	@Bean("cardao")
//	public CarDao carDao() {
//
//		CarImpl dao = new CarImpl();
//
//		dao.setJdbcTemplate(jdbcTemplate());
//
//		return dao;
//	}

}
