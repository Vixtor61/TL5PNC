package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="estudiante")
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="c_usuario")
	private Integer codigoEstudiante;
	@Column(name="nombre")
	private String Nombre;
	@Column(name="apellido")
	
	private String Apellido;
	@Column(name="carne")
	
	private String Carnet;
	@Column(name="carrera")
	
	private String Carrera;
	
	public Estudiante() {
		
	}

	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCarnet() {
		return Carnet;
	}

	public void setCarnet(String carnet) {
		Carnet = carnet;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	};
	
	
	

}
