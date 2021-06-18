package com.asesoftware.semilla.turnos.dto;

import lombok.Data;

@Data
public class ServiciosDTO {
	
	private Integer numero_Servicio;
	
	private Integer numero_comercio;
	
	private String nombre;
	
	private String horaApertura;
	
	private String horaCierre;
	
	private String duracion;

}
