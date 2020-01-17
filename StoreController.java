package com.digirestro.hungry.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.digirestro.hungry.entities.Store;
import com.digirestro.hungry.service.StoreService;

	@RequestMapping("/api/store/")
	@RestController
	public class StoreController {
		
		@Autowired
		StoreService storeService;
		
		@GetMapping("list")
		public List<Store> getStoreList(){
			return  storeService.getAllStore();
		}
}
