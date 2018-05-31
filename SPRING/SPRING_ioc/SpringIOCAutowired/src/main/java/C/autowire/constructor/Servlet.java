package C.autowire.constructor;
public class Servlet {
	private Service service1;
	public Servlet(Service service) {
		this.service1 = service;
		System.out.println("Servlet constructor");
	}
	public void servletMethod() {
		System.out.println("Servlet.servletMethod() called");
		service1.serviceMethod();
	}
}
