package com.proyecto.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.springboot.backend.apirest.models.dao.IPersonaDao;
import com.proyecto.springboot.backend.apirest.models.entity.Persona;

@Service


public class PersonaServicelmpl implements IPersonaService  {
	
	@Autowired
	private IPersonaDao personaDao;
	@Override
	@Transactional(readOnly = true)
	 public List<Persona> findAll() {
		
		return (List<Persona>) personaDao.findAll();
	}

}
