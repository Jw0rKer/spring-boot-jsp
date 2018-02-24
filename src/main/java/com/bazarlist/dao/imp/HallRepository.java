/**
 * 
 */
package com.bazarlist.dao.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bazarlist.dao.dec.IHallRepository;
import com.bazarlist.model.Hall;

/**
 * @author JK
 *
 */
@Repository
public class HallRepository extends GenericRepository implements IHallRepository {

	@Override
	public Long count(List<String> phone, String hallName) {
		Map<String, Object> map = new HashMap<>();

		String hql = " select count(*) from " + Hall.class.getName() + " e join e.phone as p where 1<>2 ";
		if (phone != null && !phone.isEmpty()) {
			hql += " AND p in (:phoneList) ";
			map.put("phoneList", phone);
		}
		if (hallName != null && !hallName.isEmpty()) {
			hql += " AND e.name like :hallName ";
			map.put("hallName", hallName);
		}

		Query query = search(hql, map);
		return (Long) query.getSingleResult();
	}
}
