package BeanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Village {

	@Value("1")
	private int vid;

	@Value("Beed")
	private String villagename;

	@Value("75.43")
	private float population;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVillagename() {
		return villagename;
	}

	public void setVillagename(String villagename) {
		this.villagename = villagename;
	}

	public float getPopulation() {
		return population;
	}

	public void setPopulation(float population) {
		this.population = population;
	}

	public Village() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Village [vid=" + vid + ", villagename=" + villagename + ", population=" + population + "]";
	}

}
