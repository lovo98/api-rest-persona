package com.apiRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiRest.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer>{

}
