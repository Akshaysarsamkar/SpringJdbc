package WithoutXmlFile;

import org.springframework.beans.factory.annotation.Value;

public class Emp {

	@Value("12")
	private int eid;

	@Value("Akshay")
	private String name;

	@Value("25000")
	private float salary;

	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", salary=" + salary + ", company=" + company + "]";
	}

}
