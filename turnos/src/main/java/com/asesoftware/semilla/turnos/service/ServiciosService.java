package com.asesoftware.semilla.turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.turnos.entity.ServiciosEntity;
import com.asesoftware.semilla.turnos.repository.IServiciosRepository;

@Service
public class ServiciosService implements IServicesService {
	
	@Autowired
	private IServiciosRepository serviciosRepository;

	@Override
	public List<ServiciosEntity> getAll() {
		return serviciosRepository.findAll();		
	}

	@Override
	public ServiciosEntity getServiciosById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiciosEntity createServicios(ServiciosEntity serviciosEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiciosEntity updateServicios(ServiciosEntity serviciosEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteComercios(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
