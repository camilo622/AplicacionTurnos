package com.asesoftware.semilla.turnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//Clase que va realizar el modelamiento de la clase con la entidad Comercios

@Data //Anotación que genera internamente los set y get
@Entity //Anotación que marca esta clase como una entidad
@Table(name = "comercios") //anotación para vincular la entidad con la tabla de la base de datos
public class ComerciosEntity {
	
	//Generación de los atributos de la tabla Comercios
	
	@Id //Anotación para mostrar el identificador de la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") //Anotación que coloca explicitamente el nombre de la columna que se va usar
	private Integer id;
	
	@Column(name = "aforo")
	private Integer aforo;
}

