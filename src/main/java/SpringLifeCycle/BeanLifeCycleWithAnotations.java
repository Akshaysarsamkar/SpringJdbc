package SpringLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleWithAnotations  {

	private int age;

	@PostConstruct
	public void init() {
		System.out.println("init method");
	}

	@PreDestroy
	public void destory() {
		System.out.println("destory method");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BeanLifeCycleWithAnotations() {
		super();
		System.out.println("oobject is created");
	}

	@Override
	public String toString() {
		return "BeanLifeCycleWithAnotations [age=" + age + "]";
	}
	
	
	
	

}
