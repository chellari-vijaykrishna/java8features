package com.vj.set;

public class Employee {
	
	private Integer empId;
	private String empName;
	private String empMail;
	
	public Employee(Integer empId, String empName, String empMail) {
		this.empId = empId;
		this.empName = empName;
		this.empMail = empMail;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMail=" + empMail + "]";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	
	

}
