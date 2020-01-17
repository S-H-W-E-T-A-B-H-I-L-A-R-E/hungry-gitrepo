package com.digirestro.hungry.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.digirestro.hungry.repo.MenuRepository;
import com.digirestro.hungry.entities.Items;

@Service
public class MenuService {

	@Autowired
	MenuRepository menuRepository;
	
	public List<Items> getAllMenu(){
		
		return menuRepository.findAll();

	}
	
	public List<Items> findItemwithName(String name){
		return menuRepository.findItemwithName(name);
	
	}
	
}
