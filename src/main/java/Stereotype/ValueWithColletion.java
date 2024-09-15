package Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class ValueWithColletion {

	
	@Value("#{temp}")
	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ValueWithColletion [list=" + list + "]";
	}
	
	
	
	
}
