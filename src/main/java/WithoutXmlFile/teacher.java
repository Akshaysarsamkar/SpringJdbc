package WithoutXmlFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import Autowiring.Collage;

//@Component("teacher")
public class teacher {

	@Value("12")
	private int x;
	private Collage1 collage1;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public teacher(Collage1 collage1) {
		super();
		this.collage1 = collage1;
	}

	public teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "teacher [x=" + x + ", collage1=" + collage1 + "]";
	}

	public Collage1 getCollage1() {
		return collage1;
	}

	public void setCollage1(Collage1 collage1) {
		this.collage1 = collage1;
	}

}
