package com.asesoftware.semilla.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.turnos.entity.ComerciosEntity;
import com.asesoftware.semilla.turnos.entity.ServiciosEntity;
import com.asesoftware.semilla.turnos.service.IServicesService;

@RestController
@RequestMapping(path = "/api/v1/servicios")
public class ServiciosController {
	
	@Autowired
	private IServicesService serviciosService;
	
	//consultar todos
	
	@GetMapping(path = "/todos")
	public List<ServiciosEntity> getAll(){
		return serviciosService.getAll();
	}
	
	//consultar por id
	
	@GetMapping(path = "/serviciosId")
	public ServiciosEntity getServiciosParametroById(@RequestParam Integer id) {
		return serviciosService.getServiciosById(id);
	}
	//crear servicio
	
	//editar servicio
	
	//eliminar servicio

}
