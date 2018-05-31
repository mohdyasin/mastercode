package propertiesinjection.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("injectingPrimitives.xml");
		DataBaseProperties emp1 = (DataBaseProperties) context.getBean("ibref");
		emp1.displayDetails();
	}
}
