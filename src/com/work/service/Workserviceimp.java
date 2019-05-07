package com.work.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.Workdao;
import com.work.model.Work;

@Service
public class Workserviceimp implements Workservice {
	
	@Autowired
	Workdao dao;

	@Override
	@Transactional
	public void insert(Work w) {
		dao.insert(w);
	}

	@Override
	@Transactional
	public List<Work> display() {
		return dao.display();
	}

	@Override
	@Transactional
	public Object edit(String id) {
		return dao.edit(id);
	}

	@Override
	@Transactional
	public void delete(Work w1) {
		dao.delete(w1);
	}

}
