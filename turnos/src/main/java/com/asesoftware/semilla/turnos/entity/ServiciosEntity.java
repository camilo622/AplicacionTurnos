package com.asesoftware.semilla.turnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class ServiciosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "id_comercio")
	private Integer id_comercio;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "horaApertura")
	private String horaApertura;
	
	@Column(name = "horaCierre")
	private String horaCierre;
	
	@Column(name = "duracion")
	private String duracion;
	
}
