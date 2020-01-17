package com.digirestro.hungry.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digirestro.hungry.entities.Category;

	@Repository
	public interface CategoryRepository extends JpaRepository<Category, Long> {

}
