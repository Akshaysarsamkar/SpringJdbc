package SPEL;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("spel")
@Scope("prototype")
public class StaticMethodAndVariable {

	@Value("#{ T(java.lang.Math).sqrt(25) }") // static method
	private int x;

	@Value(" #{T(java.lang.Math).PI } ") // static variable
	private double y;

	@Value("#{ 12 > 12-4  }") // boolean value
	private boolean z;

	@Value("#{ new String('Akshay') }") // object
	private String name;

	@Value(" #{ list } ") // collation type
	List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public int getX() {
		return x;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean getZ() {
		return z;
	}

	public void setZ(boolean z) {
		this.z = z;
	}

	public StaticMethodAndVariable() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StaticMethodAndVariable [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", list=" + list + "]";
	}

}
