package com.anz.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.anz.dao.BaseDao;

public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao{

	@Override
	public void save(Object obj) {
		super.getHibernateTemplate().save(obj) ;
		
	}

	@Override
	public void delete(Object obj) {
		super.getHibernateTemplate().delete(obj) ;
		
	}

	@Override
	public void update(Object obj) {
		super.getHibernateTemplate().update(obj) ;
		
	}

	@Override
	public Object get(String hql) {
		return super.getHibernateTemplate().find(queryString) ;
	}
	@Override
	public List list(String hql) {
		return super.getHibernateTemplate().find(hql) ;
	}
	
}
