package com.work.dao;

import java.util.List;

import com.work.model.Work;

public interface Workdao {

	void insert(Work w);

	List<Work> display();

	Object edit(String id);

	void delete(Work w1);

}
