package com.asesoftware.semilla.turnos.service;

import java.util.List;

import com.asesoftware.semilla.turnos.entity.ServiciosEntity;



public interface IServicesService {

	public List<ServiciosEntity> getAll(); 
	
	public ServiciosEntity getServiciosById(Integer id);
		
	public ServiciosEntity createServicios(ServiciosEntity serviciosEntity); 
		
	public ServiciosEntity updateServicios(ServiciosEntity serviciosEntity);
		
	public void deleteComercios(Integer id);
}
