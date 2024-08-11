package Com.SpringCore.Spring;

public class Student {

	private int sid;
	private String sname;
	private String collage;
	private float per;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		System.out.println("getting sname");
		return sname;
	}

	public void setSname(String sname) {

		System.out.println("seting student name");
		this.sname = sname;
	}

	public String getCollage() {
		System.out.println("fetching collage name");
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

}
