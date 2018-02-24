/**
 * 
 */
package com.bazarlist.dao.imp;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.bazarlist.dao.dec.IGenericRepository;

public class GenericRepository implements IGenericRepository {

	@PersistenceContext
	protected EntityManager entityManager;

	@Transactional
	@Override
	public void save(Object entity) {
		this.entityManager.persist(entity);
	}

	@Transactional
	@Override
	public Object update(Object entity) {
		return this.entityManager.merge(entity);
	}

	@Transactional
	@Override
	public void delete(Object entity) {
		this.entityManager.detach(entity);
	}

	@Override
	public Query search(String hql, Map<String, Object> map) {
		Query query = entityManager.createQuery(hql);
		for (Map.Entry<String, Object> m : map.entrySet()) {
			query.setParameter(m.getKey(), m.getValue());
		}
		return query;
	}

}
