package com.asesoftware.semilla.turnos.service;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComerciosEntity createComercios(ComerciosEntity comerciosEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComerciosEntity updateComercios(ComerciosEntity comerciosEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteComercios(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
