package com.asesoftware.semilla.turnos.service;

import com.asesoftware.semilla.turnos.dto.ResponseDTO;
import com.asesoftware.semilla.turnos.dto.ServiciosDTO;

public interface IServicesService {

	public ResponseDTO getAll(); 
	
	public ResponseDTO getServiciosById(Integer id);
		
	public ResponseDTO createServicios(ServiciosDTO serviciosDTO); 
		
	public ResponseDTO updateServicios(ServiciosDTO serviciosDTO);
		
	public ResponseDTO deleteServicios(Integer id);
}
