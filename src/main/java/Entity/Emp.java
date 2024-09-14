package Entity;

public class Emp {

	private int empid;
	private String empname;
	private String address;
	private float salary;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empname=" + empname + ", address=" + address + ", salary=" + salary + "]";
	}

}
