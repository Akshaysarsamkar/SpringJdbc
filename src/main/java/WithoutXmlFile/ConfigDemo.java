package WithoutXmlFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "WithoutXmlFile")
public class ConfigDemo {

	@Bean
	public Company getCompany() {
		return new Company();
	}

	@Bean
	public Emp getemp() {
		Emp emp = new Emp();
		return emp;
	}

}
