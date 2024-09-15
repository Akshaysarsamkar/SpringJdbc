package Com.SpringCore.Spring;

public class Collage {
	
	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		System.out.println("setting collage id.............");
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		System.out.println("Setting collage name..........");
		this.cname = cname;
	}
	
	public Collage(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Collage [cid=" + cid + ", cname=" + cname + "]";
	}
	
	

}
