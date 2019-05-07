package com.work.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.model.Work;

@Repository
public class Workdaoimp implements Workdao {
	
	@Autowired
	SessionFactory factory;

	@Override
	public void insert(Work w) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(w);
	}

	@Override
	public List<Work> display() {
		Session session=factory.getCurrentSession();
		Query q=session.createQuery("from Work");
		List<Work> l=q.list();
		return l;
	}

	@Override
	public Object edit(String id) {
		Session session=factory.getCurrentSession();
		Work val=session.get(Work.class, Integer.parseInt(id));
		return val;
	}

	@Override
	public void delete(Work w1) {
		Session session=factory.getCurrentSession();
		session.delete(w1);
	}

	
}
