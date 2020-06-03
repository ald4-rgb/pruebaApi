package com.proyecto.springboot.backend.apirest.models.services;
import java.util.List;
import com.proyecto.springboot.backend.apirest.models.entity.Persona;

public interface IPersonaService {
	
	public List<Persona> findAll();

}
