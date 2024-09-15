package SpringJdbc.com.spring.jdbc;

public class Collage {

	private int id;
	private String cname;
	private String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Collage [id=" + id + ", cname=" + cname + ", address=" + address + "]";
	}

}
