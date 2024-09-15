package SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{85>54?43:90}")
	private int i;
	
	@Value("#{84*21}")
	private int j;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public Demo() {
		super();
	}

	@Override
	public String toString() {
		return "Demo [i=" + i + ", j=" + j + "]";
	}

}
