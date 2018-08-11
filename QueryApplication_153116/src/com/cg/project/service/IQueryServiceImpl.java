package com.cg.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.project.beans.QueryMaster;
import com.cg.project.repo.IQueryRepo;


@Component
public class IQueryServiceImpl implements IQueryService {
	
	@Autowired
	private IQueryRepo repo;

	@Override
	public QueryMaster getQueryInfo(int id) {
		return repo.findOne(id);
	}

}
