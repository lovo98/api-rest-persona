package com.apiRest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiRest.dao.PersonaDAO;
import com.apiRest.model.Persona;

@RestController
@RequestMapping("persona/")
@CrossOrigin("*")
public class PersonaRest {

	@Autowired
	private PersonaDAO personaDAO;
	
	//Guardando persona en la base de datos
	@PostMapping("savePerson")
	public void savePerson(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
	
	//listando persona de la base de datos
	@GetMapping("allPerson")
	public List<Persona> allPerson() {
		return personaDAO.findAll();
	}
	
	//eliminando persona de la base de datos
	@DeleteMapping("deletePerson/{idPersona}")
	public void deletePerson(@PathVariable("idPersona") Integer idPersona) {
		personaDAO.deleteById(idPersona);
	}
	
	//editando persona de la base de datos
	@PutMapping("editPerson")
	public void editPerson(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
	
}
