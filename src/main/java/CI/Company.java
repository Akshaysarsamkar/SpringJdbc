package CI;

public class Company {
	
	private int cid;
	private String cname;
	public Company(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}
	
	
	@Override
	public String toString() {
		return "company name is:-" + this.cname + " Rank is:" + this.cid;
	}

}
