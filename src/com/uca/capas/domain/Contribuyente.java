package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "contribuyente")
public class Contribuyente {
	
	@Id
	@GeneratedValue(generator = "contribuyente_c_contribuyente_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "contribuyente_c_contribuyente_seq", sequenceName = "public.contribuyente_c_contribuyente_seq", allocationSize = 1)
	@Column(name = "c_contribuyente")
	private Integer cContribuyente;
	
	@Column(name = "s_nombre")
	private String sNombre;
	
	@Column(name = "s_apellido")
	private String sApellido;
	
	@Column(name = "s_nit")
	private String sNit;
	
	@Column(name = "f_fecha_ingreso")
	private String fechaIngreso;

	public Contribuyente() {
		super();
	}

	public Contribuyente(Integer c_contribuyente, String sNombre, String sApellido, String sNit, String fechaIngreso) {
		super();
		this.cContribuyente = c_contribuyente;
		this.sNombre = sNombre;
		this.sApellido = sApellido;
		this.sNit = sNit;
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getC_contribuyente() {
		return cContribuyente;
	}

	public void setC_contribuyente(Integer c_contribuyente) {
		this.cContribuyente = c_contribuyente;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsApellido() {
		return sApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public String getsNit() {
		return sNit;
	}

	public void setsNit(String sNit) {
		this.sNit = sNit;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
}
