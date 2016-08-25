package com.anz.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;

import com.anz.bean.Department;
import com.anz.bean.Employee;
import com.anz.dao.DepartmentDao;
import com.opensymphony.xwork2.ActionSupport;

@Action
public class DepartmentAction extends ActionSupport{
	private DepartmentDao depDao ;
	private long id ;
	private String deptName ;
	private String location ;
	private Employee manager ;
	private int operpositions ;
	Department dep = new Department() ;
	private List<Department> list ;
	
	public List<Department> listAllDep(){
		return depDao.listAllDep() ;
	}
	public List<Department> serachSubDepByParentdepID(){
		list = depDao.serachSubDepByParentdepID(id) ;
		return list ;
	}
	public Department searchDepBySubdepId(){
		dep = depDao.searchDepBySubdepId(id) ;
		return dep ;
	}
	public void updateDepByDepID(){
		depDao.updateDepByDepID(dep) ;
	}
}
