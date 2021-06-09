package com.asesoftware.semilla.turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.semilla.turnos.entity.ServiciosEntity;

public interface IServiciosRepository extends JpaRepository<ServiciosEntity, Integer>{

}
