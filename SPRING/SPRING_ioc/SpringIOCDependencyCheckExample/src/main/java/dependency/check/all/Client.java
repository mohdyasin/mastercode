package dependency.check.all;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dependency/injection/all/dependencycheck_all.xml");
		Car car = (Car) context.getBean("ibref");
		car.toString();
	}

}
