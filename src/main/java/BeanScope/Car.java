package BeanScope;

public class Car {

	private int carid;
	private String carname;
	private int prize;

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + ", prize=" + prize + "]";
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

}
