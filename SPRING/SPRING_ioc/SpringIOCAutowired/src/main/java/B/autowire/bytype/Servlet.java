package B.autowire.bytype;

public class Servlet {
	private Service service1;
	public void setService2(Service service1) {
		this.service1 = service1;
	}
	public void servletMethod() {
		System.out.println("Servlet.servletMethod() called");
		service1.serviceMethod();
	}
}
