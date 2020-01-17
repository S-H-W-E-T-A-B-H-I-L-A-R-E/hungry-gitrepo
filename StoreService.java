package com.digirestro.hungry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.digirestro.hungry.repo.StoreRepository;
import java.util.List;
import com.digirestro.hungry.entities.Store;

@Service
public class StoreService {
	@Autowired
	StoreRepository storeRepository;
	
	public List<Store> getAllStore()	{
	
		return storeRepository.findAll();
	
	}

}
