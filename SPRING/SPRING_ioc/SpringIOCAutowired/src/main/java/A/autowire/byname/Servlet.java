package A.autowire.byname;
public class Servlet {
	private Service service;
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public void servletMethod(){
		System.out.println("Servlet.servletMethod() called");
		service.serviceMethod();
	}
}
