package com.lsonetwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsonetwork.models.Minor;

@Repository
public interface MinorRepository extends JpaRepository<Minor, Integer>{

}
