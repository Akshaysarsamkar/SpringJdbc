package SpringLifeCycle;

public class SpringLifeCycleWithXml {
	
	private int Age;

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}



	public SpringLifeCycleWithXml() {
		super();
		System.out.println("object is create");
	}

	@Override
	public String toString() {
		return "SpringLifeCycleWithXml [Age=" + Age + "]";
	}

	
	
	public void init() {
		System.out.println("inside init method");
	}
	
	public void destroy() {
		System.out.println("inside destroy method");
	}

}
