package com.digirestro.hungry.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.digirestro.hungry.entities.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>{
}
