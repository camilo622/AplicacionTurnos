package com.asesoftware.semilla.turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.turnos.dto.ComerciosDTO;
import com.asesoftware.semilla.turnos.dto.ResponseDTO;
import com.asesoftware.semilla.turnos.entity.ComerciosEntity;
import com.asesoftware.semilla.turnos.mapper.IComerciosMapper;
import com.asesoftware.semilla.turnos.repository.IComerciosRepository;

@Service //Anotación que expresa que la clase maneja lógica de negocio
public class ComerciosService implements IComerciosService{

	@Autowired //Inyecta la dependencia en esta variable; tomar la instancia de see repositorio e inyectarla en la clase sin necesidad de usar new
	private IComerciosRepository comerciosRepository;
	
	@Autowired
	private IComerciosMapper mapperComercios; 
	
	@Override
	public ResponseDTO getAll() {
		
		return new ResponseDTO(mapperComercios.listEntityToDto(comerciosRepository.findAll()), true, "ok", HttpStatus.OK);
		
	}

	@Override
	public ResponseDTO getComerciosById(Integer id) {
		
		//Cuando se necesite retornar la información
		
		Optional<ComerciosEntity> comerciosEntity = comerciosRepository.findById(id);
		
		if (comerciosEntity.isPresent()) {
			return new ResponseDTO(comerciosEntity.get(), true, "consulta realizada", HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "comercio no encontrado", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO createComercios(ComerciosDTO comerciosDTO) {
		try {
			ComerciosEntity comerciosEntity = mapperComercios.dtoToEntity(comerciosDTO);
			
			comerciosRepository.save(comerciosEntity);
			
			// comerciosEntity.setId(null); //Por si no se quiere mostrar esa propiedad cuando se devuelva la información
			
			return new ResponseDTO(mapperComercios.entityToDTO(comerciosEntity), true, "comercio Creado", HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseDTO(null, false, "comercio no se puede crear", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO updateComercios(ComerciosDTO comerciosDTO) {
		try {
			ComerciosEntity comerciosEntity = mapperComercios.dtoToEntity(comerciosDTO);
			
			comerciosRepository.save(comerciosEntity);
			
			return new ResponseDTO(mapperComercios.entityToDTO(comerciosEntity), true, "comercio actualizado", HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseDTO(null, false, "comercio no se puede actualizar", HttpStatus.OK);
		}	
	}

	@Override
	public ResponseDTO deleteComercios(Integer id) {
		
		Optional<ComerciosEntity> comerciosEntity = comerciosRepository.findById(id);
		
		if (comerciosEntity.isPresent()) {
			comerciosRepository.deleteById(id);
			return new ResponseDTO(null, true, "comercio eliminado", HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "comercio no se puede eliminar", HttpStatus.OK);
		} 
		
				
	}

}
