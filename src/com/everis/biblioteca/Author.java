package com.everis.biblioteca;

import java.util.Date;

public class Author { 
	String idAuthor;
	String NombreAuthor;
	String Apellido1;
	String Apellido2;
	Date FechaNacimiente;
	String Cuidad;
	String DescripcionAuthor;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String idAuthor, String nombreAuthor, String apellido1,
			String apellido2, Date fechaNacimiente, String cuidad,
			String descripcionAuthor) {
		super();
		this.idAuthor = idAuthor;
		NombreAuthor = nombreAuthor;
		Apellido1 = apellido1;
		Apellido2 = apellido2;
		FechaNacimiente = fechaNacimiente;
		Cuidad = cuidad;
		DescripcionAuthor = descripcionAuthor;
	}
	public String getIdAuthor() {
		return idAuthor;
	}
	public void setIdAuthor(String idAuthor) {
		this.idAuthor = idAuthor;
	}
	public String getNombreAuthor() {
		return NombreAuthor;
	}
	public void setNombreAuthor(String nombreAuthor) {
		NombreAuthor = nombreAuthor;
	}
	public String getApellido1() {
		return Apellido1;
	}
	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}
	public String getApellido2() {
		return Apellido2;
	}
	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}
	public Date getFechaNacimiente() {
		return FechaNacimiente;
	}
	public void setFechaNacimiente(Date fechaNacimiente) {
		FechaNacimiente = fechaNacimiente;
	}
	public String getCuidad() {
		return Cuidad;
	}
	public void setCuidad(String cuidad) {
		Cuidad = cuidad;
	}
	public String getDescripcionAuthor() {
		return DescripcionAuthor;
	}
	public void setDescripcionAuthor(String descripcionAuthor) {
		DescripcionAuthor = descripcionAuthor;
	}
	

}
