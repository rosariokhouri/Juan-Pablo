package com.sumame.web.entidades;

import java.util.Date;

public class Empresa extends Usuario {

	private Date fechaAltaEmpresa;
	private float valoracion;
	
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Empresa(String idUsuario, String contraseña, String email, Date fechaAltaUsuario, Date fechaBajaUsuario,
			String nacionalidadUsuario, String nombreUsuario, String telefono) {
		super(idUsuario, contraseña, email, fechaAltaUsuario, fechaBajaUsuario, nacionalidadUsuario, nombreUsuario, telefono);
		// TODO Auto-generated constructor stub
	}
	
	public Empresa(Date fechaAltaEmpresa, float valoracion) {
		super();
		this.fechaAltaEmpresa = fechaAltaEmpresa;
		this.valoracion = valoracion;
	}

	public Date getFechaAltaEmpresa() {
		return fechaAltaEmpresa;
	}

	public void setFechaAltaEmpresa(Date fechaAltaEmpresa) {
		this.fechaAltaEmpresa = fechaAltaEmpresa;
	}

	public float getValoracion() {
		return valoracion;
	}

	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Empresa [fechaAltaEmpresa=" + fechaAltaEmpresa + ", valoracion=" + valoracion + "]";
	}
	
}
