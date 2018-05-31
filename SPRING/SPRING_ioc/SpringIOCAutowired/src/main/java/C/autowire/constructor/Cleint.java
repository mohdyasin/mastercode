package C.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Cleint {
	public static void main(String[] args) {
		System.out.println("Auto wiring (constructor).");
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire/C_constructor/autowireconstructor.xml");
		Servlet servlet = (Servlet) context.getBean("servletref");
		servlet.servletMethod();
	}
}
