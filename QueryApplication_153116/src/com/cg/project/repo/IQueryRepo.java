package com.cg.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.beans.QueryMaster;

public interface IQueryRepo extends JpaRepository<QueryMaster,Integer> {

}
