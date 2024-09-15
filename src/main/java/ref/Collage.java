package ref;

public class Collage {
	
	private int id;
	private String cname;
	private Student stu;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "Collage [id=" + id + ", cname=" + cname + ", stu=" + stu + "]";
	}
	

	
	

}
