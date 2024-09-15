package Com.SpringCore.InjectCollationtypes;

import java.util.Map;

public class MapExample {
	
	private int id;
	private Map<String, Integer> subjectmark;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<String, Integer> getSubjectmark() {
		return subjectmark;
	}
	public void setSubjectmark(Map<String, Integer> subjectmark) {
		this.subjectmark = subjectmark;
	}
	
	
	@Override
	public String toString() {
		return "MapExample [id=" + id + ", subjectmark=" + subjectmark + "]";
	}
	
	
	
	

}
