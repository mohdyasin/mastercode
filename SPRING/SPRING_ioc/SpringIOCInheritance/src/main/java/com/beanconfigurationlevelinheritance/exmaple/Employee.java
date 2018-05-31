package com.beanconfigurationlevelinheritance.exmaple;

public class Employee {

	private int eno;
	private String ename;
	private double sal;
	private String desig;
	private String hno;
	private String city;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal
				+ ", desig=" + desig + ", hno=" + hno + ", city=" + city
				+ ", getEno()=" + getEno() + ", getEname()=" + getEname()
				+ ", getSal()=" + getSal() + ", getDesig()=" + getDesig()
				+ ", getHno()=" + getHno() + ", getCity()=" + getCity() + "]";
	}

}
