package com.java.demo.section2;

public class CompanyEmpolyee {
private Integer empid;
private String name;
private Company company;
public CompanyEmpolyee() {
	
}

public CompanyEmpolyee(Integer empid, String name, Company company) {
	super();
	this.empid = empid;
	this.name = name;
	this.company = company;
}

public Integer getEmpid() {
	return empid;
}
public void setEmpid(Integer empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}

@Override
public String toString() {
	return "CompanyEmpolyee [empid=" + empid + ", name=" + name + ", company=" + company.getName() + "]";
}


}
