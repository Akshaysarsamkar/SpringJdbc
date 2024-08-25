package CI;

/*
 * how to solve Ambuguity problem 
         1:- class check the order of constructor and call first constructor 
         2:- if in class string constructoe is there the call string constructor by then they can not check ordernof constructor 
         3:- if u give type in xml file then as per type constructor is call 
         
         note :-
          in xml file we can give constructor parameter indexing as in this indexing start from 0
            like int a ;
                 int b;
                 
          <bean class="CI.AmbiguityProblem" name="ambiguity">
               <constructor-arg value="12" type="double" index="1"/>  value of b 
               <constructor-arg value="42" type="double" index="0"/>  value of a
        </bean>
        
 */




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiguityTest {

	public static void main(String[] args) {
	
		ApplicationContext c = new ClassPathXmlApplicationContext("CI/ciconfig.xml");
		AmbiguityProblem a = (AmbiguityProblem) c.getBean("ambiguity");
		a.Check();

	}

}
