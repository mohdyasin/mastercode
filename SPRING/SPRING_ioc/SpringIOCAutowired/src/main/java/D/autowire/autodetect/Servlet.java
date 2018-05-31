package D.autowire.autodetect;

public class Servlet {
	private Service service;
	/*public Servlet() {
	}*/
	public Servlet(Service service) {
		System.out.println("Servlet constructor");
		this.service = service;
	}
	public void setService(Service service) {
		System.out.println("setService");
		this.service = service;
	}

	public void servletMethod() {
		System.out.println("Servlet.servletMethod() called");
		service.serviceMethod();
	}
}
