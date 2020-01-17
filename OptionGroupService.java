package com.digirestro.hungry.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.digirestro.hungry.repo.OptionGroupRepository;
import com.digirestro.hungry.entities.OptionGroups;

@Service
public class OptionGroupService {

	@Autowired
	OptionGroupRepository optiongroupRepository;
	
	public List<OptionGroups> getAllOptionGroups(){
		
		return optiongroupRepository.findAll();
	}
}
