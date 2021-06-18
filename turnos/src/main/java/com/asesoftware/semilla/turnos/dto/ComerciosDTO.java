package com.asesoftware.semilla.turnos.dto;

import java.util.List;

import com.asesoftware.semilla.turnos.entity.ServiciosEntity;

import lombok.Data;

@Data
public class ComerciosDTO {

	private Integer num_identificador;
	
	private Integer aforo;
	
	private String nombre;
	
	//private List<ServiciosEntity> servicios;
	
}
