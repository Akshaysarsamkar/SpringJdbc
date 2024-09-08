package WithoutXmlFile;

import org.springframework.beans.factory.annotation.Value;

public class Collage1 {

	@Value("21")
	private int y;

	public Collage1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Collage1 [y=" + y + "]";
	}

}
