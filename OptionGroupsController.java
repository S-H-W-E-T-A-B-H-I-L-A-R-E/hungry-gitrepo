package com.digirestro.hungry.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.digirestro.hungry.entities.OptionGroups;
import com.digirestro.hungry.service.OptionGroupService;


@RequestMapping("/api/optiongroups/")
@RestController
public class OptionGroupsController {
	
	@Autowired
	OptionGroupService optiongroupService;
	
	@GetMapping("list")
	public List<OptionGroups> getOptionGroupList(){
		return optiongroupService.getAllOptionGroups();
	}
	

}
