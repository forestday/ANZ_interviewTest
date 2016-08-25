package com.anz.dao;

import java.util.List;

public interface BaseDao {
	public void save(Object obj);

	public void delete(Object obj);

	public void update(Object obj);

	public Object get(Class cls, java.io.Serializable id);

	public List list(String hql);
}
