package com.anz.dao.impl;

import java.util.List;

import com.anz.bean.Department;
import com.anz.bean.Employee;
import com.anz.dao.DepartmentDao;

public class DepartmentDaoImpl extends BaseDaoImpl implements DepartmentDao{

	@Override
	public List<Department> listAllDep() {
		String hql = "from Department" ;
		return super.list(hql) ;
	}

	@Override
	public List<Department> serachSubDepByParentdepID(long parentDepID) {
		String hql = "from Department where deptID = " + parentDepID ;
		return super.list(hql);
	}

	@Override
	public Department searchDepBySubdepId(long subdepID) {
		String hql = "from Department where id = " + subdepID ;
		return (Department)super.get(hql) ;
	}

	@Override
	public void updateDepByDepID(Department dep) {
		super.update(dep) ;
	}

	@Override
	public void removeDepByDepID(Department dep) {
		// TODO Auto-generated method stub
		return null;
	}

}
