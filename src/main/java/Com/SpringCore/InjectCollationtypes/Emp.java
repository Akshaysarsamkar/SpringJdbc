package Com.SpringCore.InjectCollationtypes;

import java.util.List;


// Example of how to inject list types 
public class Emp {
	
	private int id;
	private List<String> mails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getMails() {
		return mails;
	}
	public void setMails(List<String> mails) {
		this.mails = mails;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", mails=" + mails + "]";
	}

	
}
