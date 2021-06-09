package com.asesoftware.semilla.turnos.service;

import java.util.List;

import com.asesoftware.semilla.turnos.entity.ComerciosEntity;

public interface IComerciosService {
	
	public List<ComerciosEntity> getAll(); 
		
	public ComerciosEntity getComerciosById(Integer id);
		
	public ComerciosEntity createComercios(ComerciosEntity comerciosEntity); 
		
	public ComerciosEntity updateComercios(ComerciosEntity comerciosEntity);
		
	public void deleteComercios(Integer id);

}
