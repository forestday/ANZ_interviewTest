package com.anz.dao;

import java.util.List;

import com.anz.bean.Department;
import com.anz.bean.Employee;

public interface EmployeeDao {
	public List<Employee> listAllEmp() ;
	public List<Employee> serachEmpByDepID(final long depID) ;
	public Employee searchEmpById( long empID) ;
	public Department searchDepByempID(final long empID) ;
	public void updateEmpByEmpID(Employee emp) ;
	public void removeEmpByempID(Employee emp) ;
	public void saveEmp() ;
}
