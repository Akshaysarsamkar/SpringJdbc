package Com.SpringCore.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//      ApplicationContext context =   new ClassPathXmlApplicationContext("config.xml");
//     Collage c = (Collage) context.getBean("col");
//     System.out.println(c);
//     System.out.println(c.getCname());
        
        
        ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");
        City city = (City) c.getBean("CityData");
        System.out.println(city);
        
        System.out.println("Population of the " + city.getCityName() + " is:" + city.getPopulation());
    }
}
