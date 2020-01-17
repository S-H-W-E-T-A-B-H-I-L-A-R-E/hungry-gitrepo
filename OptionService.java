package com.digirestro.hungry.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.digirestro.hungry.entities.Options;
import com.digirestro.hungry.repo.MenuRepository;
import com.digirestro.hungry.repo.OptionRepository;

@Service
public class OptionService {

	@Autowired
	OptionRepository optionRepository;
	
	public List<Options> getAllOption(){
		
		return optionRepository.findAll();
	}
}
