package com.bazarlist.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bazarlist.dao.dec.IHallRepository;
import com.bazarlist.model.Hall;
import com.bazarlist.service.dec.IHallService;

@Service
public class HallService implements IHallService {

	@Autowired
	private IHallRepository repository;

	@Transactional
	@Override
	public void save(Hall entity) throws Exception {
		System.out.println(this.repository.count(entity.getPhone(), entity.getName()).toString() + " fount");
		if (this.repository.count(entity.getPhone(), entity.getName()) == 0)
			this.repository.save(entity);
		else
			throw new Exception();
	}

}
