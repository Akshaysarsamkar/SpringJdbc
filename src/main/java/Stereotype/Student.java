package Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Student {

	@Value("Akshaykumar")
	private String studentname;
	
	@Value("Beed")
	private String city;
	
	@Value("12")
	private int id;

	public Student() {
		super();
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", city=" + city + ", id=" + id + "]";
	}

}
