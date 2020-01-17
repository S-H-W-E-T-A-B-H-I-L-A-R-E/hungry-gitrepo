package com.digirestro.hungry.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;

import com.digirestro.hungry.entities.Items;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.digirestro.hungry.service.MenuService;

@RequestMapping("/api/menu/")
@RestController
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	@GetMapping("list")
	public List<Items> getMenuList(){
		return menuService.getAllMenu();
	}
	
	
	
	
	@GetMapping("list/{name}")
	public List<Items> getMenuList(@Param("name") String name){
		return menuService.findItemwithName(name);
	}
}
