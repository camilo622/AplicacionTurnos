package com.asesoftware.semilla.turnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.turnos.dto.ResponseDTO;
import com.asesoftware.semilla.turnos.dto.ServiciosDTO;
import com.asesoftware.semilla.turnos.service.IServicesService;

@RestController
@RequestMapping(path = "/api/v1/servicios")
public class ServiciosController {
	
	@Autowired
	private IServicesService serviciosService;
	
	//consultar todos
	
	@GetMapping(path = "/todos")
	public ResponseDTO getAll(){
		return serviciosService.getAll();
	}
	
	//consultar por id
	
	@GetMapping(path = "/serviciosId")
	public ResponseDTO getServiciosParametroById(@RequestParam Integer id) {
		return serviciosService.getServiciosById(id);
	}
	
	//crear servicio
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO createServicios(@RequestBody ServiciosDTO serviciosDTO) {
		//si durante la ejecución en el body se le pasa un dato incorrecto, no se guardara sino que retornará el null para mostrar que está mal.
		try {
			return serviciosService.createServicios(serviciosDTO);
		}catch(Exception e) {
			return null;
		}
	}
	
	//editar servicio
	
	@PostMapping(path = "/actualizar", consumes = "application/json", produces = "application/json")
	public ResponseDTO updateServicios(@RequestBody ServiciosDTO serviciosDTO) {
		//si durante la ejecución en el body se le pasa un dato incorrecto, no se guardara sino que retornará el null para mostrar que está mal. 
		try {
			return serviciosService.updateServicios(serviciosDTO);
		}catch (Exception e){
			return null;
		}
	}
	
	//eliminar servicio
	
	@GetMapping(path = "/borrar/{id}")
	public ResponseDTO deleteServicios(@PathVariable Integer id) {
		return serviciosService.deleteServicios(id);
	}
	

}
