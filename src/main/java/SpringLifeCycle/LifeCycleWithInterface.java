package SpringLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleWithInterface implements InitializingBean ,DisposableBean {
	
	private String name;
	
	private int age;

	public LifeCycleWithInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "LifeCycleWithInterface [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("inside destroy method with interface method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("inside the init method with intrface method ");
		
	}
	
	

}
