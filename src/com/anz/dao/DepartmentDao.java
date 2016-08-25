package com.anz.dao;

import java.util.List;

import com.anz.bean.Department;
import com.anz.bean.Employee;

public interface DepartmentDao {
	public List<Department> listAllDep() ;
	public List<Department> serachSubDepByParentdepID(final long parentDepID) ;
	public Department searchDepBySubdepId(final long subdepID) ;
	public String updateDepByDepID(Department dep) ;
	public String removeDepByDepID(Department dep) ;
}
