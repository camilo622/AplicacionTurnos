package com.asesoftware.semilla.turnos.service;

import java.util.List;

import com.asesoftware.semilla.turnos.dto.ComerciosDTO;
import com.asesoftware.semilla.turnos.dto.ResponseDTO;
import com.asesoftware.semilla.turnos.entity.ComerciosEntity;

public interface IComerciosService {
	
	public ResponseDTO getAll(); 
		
	public ResponseDTO getComerciosById(Integer id);
		
	public ResponseDTO createComercios(ComerciosDTO comerciosDTO); 
		
	public ResponseDTO updateComercios(ComerciosDTO comerciosDTO);
		
	public ResponseDTO deleteComercios(Integer id);

}
