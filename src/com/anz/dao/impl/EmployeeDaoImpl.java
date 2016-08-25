package com.anz.dao.impl;

import java.util.List;

import com.anz.bean.Department;
import com.anz.bean.Employee;
import com.anz.dao.EmployeeDao;

public class EmployeeDaoImpl extends BaseDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> listAllEmp() {
		String hql = "from Employee" ;
		return super.list(hql) ;
	}

	@Override
	public List<Employee> serachEmpByDepID(long depID) {
		String hql = "from Employee where deptID = " + depID ;
		return super.list(hql);
	}

	@Override
	public Employee searchEmpById(long empID) {
		String hql = "from Employee where id = " + empID ;
		return (Employee)super.get(hql) ;
	}

	@Override
	public Department searchDepByempID(long empID) {
		String hql = " from Department where id in (select deptid from Employee where id = " + empID + ")" ;
		return (Department)super.get(hql) ;
	}

	@Override
	public void updateEmpByEmpID(Employee emp) {
		 super.update(emp) ;
	}

	@Override
	public void removeEmpByempID(Employee emp) {
		super.delete(emp) ;
	}

	@Override
	public String saveEmp(Employee emp) {
		super.save(emp) ;
	}

}
