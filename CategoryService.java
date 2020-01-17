package com.digirestro.hungry.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.digirestro.hungry.repo.CategoryRepository;
import com.digirestro.hungry.entities.Category;
import com.digirestro.hungry.entities.Items;

@Service
public class CategoryService {

	@Autowired
	
	CategoryRepository categoryRepository;
	
	public  List<Category> getAllCategory(){
		
		return categoryRepository.findAll();
	}
}
