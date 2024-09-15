package Com.SpringCore.InjectCollationtypes;

import java.util.Set;

public class SetExample {
	
	private int id;
	private Set<String> phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "SetExample [id=" + id + ", phone=" + phone + "]";
	}
	
}
