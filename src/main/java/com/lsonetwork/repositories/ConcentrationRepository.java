package com.lsonetwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsonetwork.models.Concentration;

@Repository
public interface ConcentrationRepository extends JpaRepository<Concentration, Integer>{

}
