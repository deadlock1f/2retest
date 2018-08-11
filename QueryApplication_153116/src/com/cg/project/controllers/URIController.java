package com.cg.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.project.beans.QueryMaster;

@Controller
public class URIController {
	
	@RequestMapping("/")
	public String getRegistrationPage() {
		return "indexPage";
	}
	
	@ModelAttribute("queryMaster")
		public QueryMaster getquery() {
		return new QueryMaster();
	}
	
	@RequestMapping(value="/detailsPage")
	public String getretrieveTraineePage() {
		return "detailsPage";

}
	
	
	@RequestMapping(value="/updateSuccessPage")
	public String getUpdateSuccessPage() {
		return "updateSuccessPage";

}
}
