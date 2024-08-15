package Com.SpringCore.Spring;

public class Company {
	
	private int id;
	private String company_name;
	private int rank;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", company_name=" + company_name + ", rank=" + rank + "]";
	}
	

	
  
}
