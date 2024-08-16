package CI;

public class Person { 
	
	private int pid;
	private String name;
	public Company c;
	
	public Person(int pid, String name,Company c) {
		this.pid = pid;
		this.name = name;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student roll no:- "+this.pid + " Student Name:- " + this.name + " working at "+this.c;
	}
}
