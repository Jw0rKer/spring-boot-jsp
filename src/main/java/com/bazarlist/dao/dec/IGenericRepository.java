package com.bazarlist.dao.dec;

import java.util.Map;

import javax.persistence.Query;

public interface IGenericRepository {

	void save(Object entity);

	Object update(Object entity);

	void delete(Object entity);

	Query search(String hql, Map<String, Object> map);


}
