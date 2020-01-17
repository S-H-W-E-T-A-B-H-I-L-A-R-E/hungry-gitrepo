package com.digirestro.hungry.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.digirestro.hungry.entities.Options;

@Repository
public interface OptionRepository extends JpaRepository<Options, Long> {
}
