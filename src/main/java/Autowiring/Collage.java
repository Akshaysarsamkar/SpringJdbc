package Autowiring;

public class Collage {
	
	private int cid;
	private String cname;
	
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Collagebid is :" + cid + " collage name: " + cname;
	}
	
	
	
	

}
