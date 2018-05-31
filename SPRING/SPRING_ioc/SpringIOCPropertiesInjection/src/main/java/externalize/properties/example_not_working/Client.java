package externalize.properties.example_not_working;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("externalize/properties/example/DBProperties.properties");
		DBPropertiesBean emp1 = (DBPropertiesBean) context.getBean("ibref");
		emp1.toString();
	}
}
