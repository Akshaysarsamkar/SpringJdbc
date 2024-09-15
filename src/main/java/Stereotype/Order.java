package Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {

	@Value("12")
	private int oid;

	@Value("Panir")
	private String menu;

	@Value("582")
	private float totalbill;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public float getTotalbill() {
		return totalbill;
	}

	public void setTotalbill(float totalbill) {
		this.totalbill = totalbill;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", menu=" + menu + ", totalbill=" + totalbill + "]";
	}

}
