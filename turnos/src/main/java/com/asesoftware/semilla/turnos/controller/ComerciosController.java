package com.asesoftware.semilla.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.turnos.entity.ComerciosEntity;
import com.asesoftware.semilla.turnos.service.IComerciosService;

@RestController //Anotación para que se tome la clase como un web service o controlador
@RequestMapping(path = ("/api/v1/comercios"))//Permite asignar el Path para el controlador
public class ComerciosController {

	@Autowired
	private IComerciosService comerciosservice;
	//Consultar todos
	
	@GetMapping(path = "/todos")//anotación del verbo http get.
	public List<ComerciosEntity> getAll(){
		return comerciosservice.getAll();
	}
	
	//Consultar por ID
	
	//Busqueda a través del path
	/* Por alguna razón que solo Dios y un experto sabrá, esto no funciona :)
	@GetMapping(params = ("/comercio/{id}")) //El parametro se va poner en los corchetes se pone en la URL
	public ComerciosEntity getComerciosById(@PathVariable Integer id) {
		
		return comerciosservice.getComerciosById(id);
	}
	*/
	
	//Mismo método pero a través de un parametro
	@GetMapping(path = "/comercioid")
	public ComerciosEntity getComerciosParametroById(@RequestParam Integer id) {
		
		return comerciosservice.getComerciosById(id);
	}
	
	//Crear Comercio
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")//Path para verbo http que pasa parametros desde el body
	public ComerciosEntity createComercios(@RequestBody ComerciosEntity comerciosEntity) {			
		//si durante la ejecución en el body se le pasa un dato incorrecto, no se guardara sino que retornará el null para mostrar que está mal. 
		try {
			return comerciosservice.createComercios(comerciosEntity);
		}catch(Exception e) {
			return null;
		}
	}
	
	//Editar Comercio
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")//Path para verbo http que pasa parametros desde el body
	public ComerciosEntity updateComercios(@RequestBody ComerciosEntity comerciosEntity) {			
		//si durante la ejecución en el body se le pasa un dato incorrecto, no se guardara sino que retornará el null para mostrar que está mal. 
		try {
			return comerciosservice.updateComercios(comerciosEntity);
		}catch(Exception e) {
			return null;
		}
	}
	
	//Eliminar Comercio
	
}
