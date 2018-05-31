package B.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Cleint {
	public static void main(String[] args) {
		System.out.println("Auto wiring (byType).");
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire/B_bytype/autowirebytype.xml");
		Servlet servlet = (Servlet) context.getBean("servletref");
		servlet.servletMethod();
	}
}
