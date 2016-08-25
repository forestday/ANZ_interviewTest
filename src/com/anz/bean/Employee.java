package com.anz.bean;

import java.sql.Date;

import org.hibernate.annotations.Entity;
@Entity
public class Employee {
	private long empID;
	private String firstName;
	private String lastName;
	private String ldapUsername;
	private long deptID ;
	public long getDeptID() {
		return deptID;
	}
	public void setDeptID(long deptID) {
		this.deptID = deptID;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public long getEmpID() {
		return empID;
	}
	public void setEmpID(long empID) {
		this.empID = empID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLdapUsername() {
		return ldapUsername;
	}
	public void setLdapUsername(String ldapUsername) {
		this.ldapUsername = ldapUsername;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
