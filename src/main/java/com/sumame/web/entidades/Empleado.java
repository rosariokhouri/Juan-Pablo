package com.sumame.web.entidades;

import java.util.Date;

public class Empleado extends Usuario {

	
	private String apellido;
	private String cv;
	private Date fechaNacimiento;
	private String nombreEmpleado;
	private String sexo;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String idUsuario, String contraseña, String email, Date fechaAltaUsuario, Date fechaBajaUsuario,
			String nacionalidadUsuario, String nombreUsuario, String telefono) {
		super(idUsuario, contraseña, email, fechaAltaUsuario, fechaBajaUsuario, nacionalidadUsuario, nombreUsuario, telefono);
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String apellido, String cv, Date fechaNacimiento, String nombreEmpleado, String sexo) {
		super();
		this.apellido = apellido;
		this.cv = cv;
		this.fechaNacimiento = fechaNacimiento;
		this.nombreEmpleado = nombreEmpleado;
		this.sexo = sexo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Empleado [apellido=" + apellido + ", cv=" + cv + ", fechaNacimiento=" + fechaNacimiento
				+ ", nombreEmpleado=" + nombreEmpleado + ", sexo=" + sexo + "]";
	}
	
}
