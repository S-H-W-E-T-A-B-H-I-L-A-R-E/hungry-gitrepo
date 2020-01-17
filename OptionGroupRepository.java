package com.digirestro.hungry.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digirestro.hungry.entities.OptionGroups;

@Repository
public interface OptionGroupRepository extends JpaRepository<OptionGroups, Long> 
 {

}
