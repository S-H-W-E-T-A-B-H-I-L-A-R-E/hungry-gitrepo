package com.digirestro.hungry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digirestro.hungry.entities.Category;
import com.digirestro.hungry.service.CategoryService;


@RequestMapping ("/api/category/")
@RestController
public class CategoryController {
		
		@Autowired
		CategoryService CategoryService;
		
		@GetMapping("list")
		public List<Category> getMenuList(){
			return CategoryService.getAllCategory();
		}
		

	}


