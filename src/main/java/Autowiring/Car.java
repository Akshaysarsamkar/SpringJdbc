package Autowiring;

public class Car {
	
	private int cid;
	private String carname;
	
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", carname=" + carname + "]";
	}

}
