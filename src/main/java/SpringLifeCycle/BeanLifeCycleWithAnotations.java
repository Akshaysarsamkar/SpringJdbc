package SpringLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleWithAnotations implements InitializingBean, DisposableBean {

	private int age;

	@Override
	public void destroy() throws Exception {
		System.out.println("destory");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
		
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
