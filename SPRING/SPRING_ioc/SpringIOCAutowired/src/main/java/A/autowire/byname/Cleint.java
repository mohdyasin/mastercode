package A.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Cleint {
	public static void main(String[] args) {
		System.out.println("Auto wiring (byName).");
		ApplicationContext context =
		new ClassPathXmlApplicationContext("autowire/A_byname/autowirebyname.xml");
		Servlet servlet = (Servlet) context.getBean("servletref");
		servlet.servletMethod();
	}
}
