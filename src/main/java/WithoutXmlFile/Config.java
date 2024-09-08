package WithoutXmlFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "WithoutXmlFile")
public class Config {

	@Bean
	public Collage1 getCollage1() {
		return new Collage1();
	}

	@Bean
	public teacher geTeacher() {
		teacher t = new teacher(getCollage1());
		return t;
	}

}
