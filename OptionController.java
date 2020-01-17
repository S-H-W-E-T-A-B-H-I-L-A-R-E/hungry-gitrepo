package com.digirestro.hungry.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.digirestro.hungry.entities.Options;
import com.digirestro.hungry.service.OptionService;


@RequestMapping("/api/option/")
@RestController
public class OptionController {
	
	@Autowired
	OptionService optionService;
	
	@GetMapping("list")
	public List<Options> getOptionList(){
		return optionService.getAllOption();
	}
	

}
