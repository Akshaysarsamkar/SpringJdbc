package Autowiring;

public class Candidate {
	
	private vote totalvote;

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public vote getTotalvote() {
		return totalvote;
	}

	public void setTotalvote(vote totalvote) {
		this.totalvote = totalvote;
	}

	@Override
	public String toString() {
		return "Candidate [totalvote=" + totalvote + "]";
	}
	
	

}
