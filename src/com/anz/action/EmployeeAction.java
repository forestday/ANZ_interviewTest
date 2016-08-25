package com.anz.action;

import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;

import com.anz.bean.Department;
import com.anz.bean.Employee;
import com.anz.bean.Gender;
import com.anz.dao.EmployeeDao;
import com.opensymphony.xwork2.ActionSupport;

@Action
public class EmployeeAction extends ActionSupport{
	private EmployeeDao empDao ;
	private long id ;
	private String firstName ;
	private String lastName ;
	private String ldapUserName ;
	private long DeptID ;
	private java.sql.Date birthDate ;
	private String title ;
	private Gender gender ;
	private List<Employee> list;
	Employee emp = new Employee() ;
	public void save(){
		
		emp.setBirthDate(birthDate) ;
		emp.setDeptID(DeptID) ;
		emp.setEmpID(id) ;
		emp.setFirstName(firstName) ;
		emp.setGender(gender.Female) ;
		emp.setLastName(lastName) ;
		emp.setLdapUsername(ldapUserName) ;
		emp.setTitle(title) ;
		empDao.saveEmp(emp) ;
	}
    public List<Employee> getEmpList(){
    	list = empDao.listAllEmp() ;
    	return list ;
    }
    public Employee searchEmpById(){
    	return empDao.searchEmpById(id) ;
    }
    public Department searchDepByempID(){
    	return empDao.searchDepByempID(id) ;
    } 
    public void updateEmpByEmpID(){
    	empDao.updateEmpByEmpID(emp) ;
    }
    public void removeEmpByempID(){
    	empDao.removeEmpByempID(emp) ;
    }
}
