package Com.SpringCore.Spring;

//the class which containes setter,getter and no logic will be their is known as pojo class 

//bean :- 1:-it implement the java.io.serialixable 
//        2:- it have default constructors 
//        3:- allow setter and getter to acess the properties

public class City {

	private int cid;
	private String CityName;
	private String State;
	private int population;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public City(int cid, String cityName, String state, int population) {
		super();
		this.cid = cid;
		CityName = cityName;
		State = state;
		this.population = population;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "City [cid=" + cid + ", CityName=" + CityName + ", State=" + State + ", population=" + population + "]";
	}

	
}
