package Standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

import Com.SpringCore.InjectCollationtypes.MapApp;

public class Village {
	
	private Set<String> personename;
    private List<String> villagename;
    private Map<String, Integer> population;
    
    
	public Set<String> getPersonename() {
		return personename;
	}
	public void setPersonename(Set<String> personename) {
		this.personename = personename;
	}
	public List<String> getVillagename() {
		return villagename;
	}
	public void setVillagename(List<String> villagename) {
		this.villagename = villagename;
	}
	public Map<String, Integer> getPopulation() {
		return population;
	}
	public void setPopulation(Map<String, Integer> population) {
		this.population = population;
	}
	public Village() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Village [personename=" + personename + ", villagename=" + villagename + ", population=" + population
				+ "]";
	}
    

}
