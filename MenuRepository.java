package com.digirestro.hungry.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.digirestro.hungry.entities.Items;

@Repository
public interface MenuRepository extends JpaRepository<Items, Long> {

//	  @Query("SELECT c FROM Items c WHERE (:name is null or c.item_name = :name) ")
//	  @Query("SELECT c FROM Items c WHERE c.item_name = 'mutterPaneer'")
//	    List<Items> findItemwithName(@Param("name") String name);



}


