package com.proyecto.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.backend.apirest.models.dao.IPersonaDao;
import com.proyecto.springboot.backend.apirest.models.entity.Persona;
@RestController
@RequestMapping("/api")


@SuppressWarnings("unused")
public class PersonaRestController {
	
	 @Autowired
	
	 private IPersonaDao personaService;
	 @GetMapping("/registros")

	 public List<Persona> index(){
		 
		 return (List<Persona>) personaService.findAll();
		 
	 }
}
