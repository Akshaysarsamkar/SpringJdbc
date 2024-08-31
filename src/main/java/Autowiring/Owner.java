package Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
     @autowired annotation := 
         1] when we need to inject dpemdency automatically then we can use @autowired annotation 
         2] we can used annotation with property,setter method and constructor those have a parameter
         3] to anable the the annotation we use <context:annotation-config /> tag in xml file
           
 */

public class Owner {
	
	@Autowired
	@Qualifier("car")  // used to solve the ambiguty problem in the xml file whwn create multiple bean with same class then used 
	private Car car;

	
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Car getCar() {
		return car;
	}

	
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Owner [car=" + car + "]";
	}
	
	

}
