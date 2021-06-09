package com.asesoftware.semilla.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.turnos.entity.ComerciosEntity;
import com.asesoftware.semilla.turnos.service.IComerciosService;

@RestController //Anotación para que se tome la clase como un web service o controlador
@RequestMapping(path = ("/api/v1/comercios"))//Permite asignar el Path para el controlador
public class ComerciosController {

	@Autowired
	private IComerciosService comerciosservice;
	//Consultar todos
	
	@GetMapping(path = ("/todos"))//anotación del verbo http get.
	public List<ComerciosEntity> getAll(){
		return comerciosservice.getAll();
	}
	
	//Consultar por ID
	
	//Crear Comercio
	
	//Editar Comercio
	
	//Eliminar Comercio
	
}
