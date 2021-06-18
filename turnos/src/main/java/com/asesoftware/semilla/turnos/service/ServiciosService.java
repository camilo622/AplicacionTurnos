package com.asesoftware.semilla.turnos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.turnos.dto.ResponseDTO;
import com.asesoftware.semilla.turnos.dto.ServiciosDTO;
import com.asesoftware.semilla.turnos.entity.ServiciosEntity;
import com.asesoftware.semilla.turnos.mapper.IServiciosMapper;
import com.asesoftware.semilla.turnos.repository.IServiciosRepository;

@Service
public class ServiciosService implements IServicesService {
	
	@Autowired
	private IServiciosRepository serviciosRepository;
	
	@Autowired
	private IServiciosMapper mapperServicios;

	@Override
	public ResponseDTO getAll() {
		
		return new ResponseDTO(mapperServicios.listEntityToDto(serviciosRepository.findAll()), true, "ok", HttpStatus.OK);
		
	}

	@Override
	public ResponseDTO getServiciosById(Integer id) {
		
		Optional<ServiciosEntity> serviciosEntity = serviciosRepository.findById(id);
		
		if(serviciosEntity.isPresent()) {
			return new ResponseDTO(mapperServicios.entityToDTO(serviciosEntity.get()), true, "Consulta de servicios realizada", HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "No existe el servicio", HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseDTO createServicios(ServiciosDTO serviciosDTO) {
		try {
			ServiciosEntity serviciosEntity = mapperServicios.dtoToEntity(serviciosDTO);
			
			serviciosRepository.save(serviciosEntity);
			
			return new ResponseDTO(mapperServicios.entityToDTO(serviciosEntity), true, "Servicio Creado con éxito", HttpStatus.OK);
			
		}catch(Exception e) {
		
			return new ResponseDTO(null, false, "No se pudo crear el servicio", HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseDTO updateServicios(ServiciosDTO serviciosDTO) {
		try {
			ServiciosEntity serviciosEntity = mapperServicios.dtoToEntity(serviciosDTO);
			
			serviciosRepository.save(serviciosEntity);
			
			return new ResponseDTO(mapperServicios.entityToDTO(serviciosEntity), true, "Servicio actualizado con éxito", HttpStatus.OK);
			
		}catch(Exception e) {
		
			return new ResponseDTO(null, false, "No se pudo actualizar el servicio", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO deleteServicios(Integer id){
		
		Optional<ServiciosEntity> serviciosEntity = serviciosRepository.findById(id);
		
		if (serviciosEntity.isPresent()) {
			serviciosRepository.deleteById(id);
			return new ResponseDTO(null, true, "servicio eliminado", HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "servicio no se puede eliminar", HttpStatus.OK);
		} 
	}

}
