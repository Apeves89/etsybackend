package com.example.finalproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finalproject.entities.Etsy;

// Our Repository, the two types in <> are the Entity and type of the ID
public interface EtsyRepository extends JpaRepository<Etsy, Integer>{

}
