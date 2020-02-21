package com.sumame.web.entidades;

import java.util.Date;

public class Usuario {

	private String idUsuario;
	private String contraseña;
	private String email;
	private Date fechaAltaUsuario;
	private Date fechaBajaUsuario;
	private String nacionalidadUsuario;
	private String nombreUsuario;
	private String telefono;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String idUsuario, String contraseña, String email, Date fechaAltaUsuario, Date fechaBajaUsuario,
			String nacionalidadUsuario, String nombreUsuario, String telefono) {
		super();
		this.idUsuario = idUsuario;
		this.contraseña = contraseña;
		this.email = email;
		this.fechaAltaUsuario = fechaAltaUsuario;
		this.fechaBajaUsuario = fechaBajaUsuario;
		this.nacionalidadUsuario = nacionalidadUsuario;
		this.nombreUsuario = nombreUsuario;
		this.telefono = telefono;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaAltaUsuario() {
		return fechaAltaUsuario;
	}

	public void setFechaAltaUsuario(Date fechaAltaUsuario) {
		this.fechaAltaUsuario = fechaAltaUsuario;
	}

	public Date getFechaBajaUsuario() {
		return fechaBajaUsuario;
	}

	public void setFechaBajaUsuario(Date fechaBajaUsuario) {
		this.fechaBajaUsuario = fechaBajaUsuario;
	}

	public String getNacionalidadUsuario() {
		return nacionalidadUsuario;
	}

	public void setNacionalidadUsuario(String nacionalidadUsuario) {
		this.nacionalidadUsuario = nacionalidadUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", contraseña=" + contraseña + ", email=" + email
				+ ", fechaAltaUsuario=" + fechaAltaUsuario + ", fechaBajaUsuario=" + fechaBajaUsuario
				+ ", nacionalidadUsuario=" + nacionalidadUsuario + ", nombreUsuario=" + nombreUsuario + ", telefono="
				+ telefono + "]";
	}
	
}
