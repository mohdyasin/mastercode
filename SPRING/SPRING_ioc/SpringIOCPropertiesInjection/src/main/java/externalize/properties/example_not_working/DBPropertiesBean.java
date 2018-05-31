package externalize.properties.example_not_working;

public class DBPropertiesBean {

	private String username;
	private String password;
	private String url;
	private String driverClass;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	@Override
	public String toString() {
		return "DBPropertiesBean [username=" + username + ", password="
				+ password + ", url=" + url + ", driverClass=" + driverClass
				+ ", getUsername()=" + getUsername() + ", getPassword()="
				+ getPassword() + ", getUrl()=" + getUrl()
				+ ", getDriverClass()=" + getDriverClass() + "]";
	}

	
}
