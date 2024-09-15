package Autowiring;


public class Student {
	
	private Collage c;

	public Collage getC() {
		return c;
	}

	public void setC(Collage c) {
		this.c = c;
	}

	public Student(Collage c) {
		super();
		this.c = c;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [c=" + c + "]";
	}

}
