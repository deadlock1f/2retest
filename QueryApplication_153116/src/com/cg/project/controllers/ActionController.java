package com.cg.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.project.beans.QueryMaster;
import com.cg.project.repo.IQueryRepo;
import com.cg.project.service.IQueryService;


@Controller
public class ActionController {
@Autowired
private IQueryService service;

@Autowired
private IQueryRepo repo;

@RequestMapping(value="/viewDetails")
public ModelAndView ViewDetails(@RequestParam("query_id") int id) {
		QueryMaster queryMaster = service.getQueryInfo(id);
		System.out.println(queryMaster);
	return new ModelAndView("detailsPage", "queryMaster",queryMaster);
}



@RequestMapping(value="/updateQuery")
public ModelAndView updateQuery(@ModelAttribute("queryMaster") QueryMaster queryMaster) {
		repo.save(queryMaster);
	return new ModelAndView("updateSuccess", "queryMaster",queryMaster);
}

}
