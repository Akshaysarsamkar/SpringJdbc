package BeanScope;

public class Student {

	private int id;
	private String studentname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
