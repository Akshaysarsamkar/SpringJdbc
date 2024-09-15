package Entity;

public class Car {

	private int carid;
	private String carName;
	private float prize;

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public float getPrize() {
		return prize;
	}

	public void setPrize(float prize) {
		this.prize = prize;
	}

	public Car() {
		super();

	}

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carName=" + carName + ", prize=" + prize + "]";
	}

}
