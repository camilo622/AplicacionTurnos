package com.asesoftware.semilla.turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.turnos.entity.ComerciosEntity;
import com.asesoftware.semilla.turnos.repository.IComerciosRepository;

@Service //Anotación que expresa que la clase maneja lógica de negocio
public class ComerciosService implements IComerciosService{

	@Autowired //Inyecta la dependencia en esta variable; tomar la instancia de see repositorio e inyectarla en la clase sin necesidad de usar new
	private IComerciosRepository comerciosRepository;
	
	@Override
	public List<ComerciosEntity> getAll() {
		return comerciosRepository.findAll();
	}

	@Override
	public ComerciosEntity getComerciosById(Integer id) {
		
		Optional<ComerciosEntity> optional = comerciosRepository.findById(id);
		
		if (optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}

	@Override
	public ComerciosEntity createComercios(ComerciosEntity comerciosEntity) {
		return comerciosRepository.save(comerciosEntity);
	}

	@Override
	public ComerciosEntity updateComercios(ComerciosEntity comerciosEntity) {
		return comerciosRepository.save(comerciosEntity);
	}

	@Override
	public void deleteComercios(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
