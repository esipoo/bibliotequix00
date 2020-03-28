package com.everis.biblioteca;

public class Usuario {

	String DNI;
	String Nombre;
	String Apellido1;
	String Apellido2;
	String Direccion;
	String TlfnoContacto;
	String BibliotecaOrigen;
	int Estado;
	Libro L;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String dNI, String nombre, String apellido1,
			String apellido2, String direccion, String tlfnoContacto,
			String bibliotecaOrigen, int estado) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellido1 = apellido1;
		Apellido2 = apellido2;
		Direccion = direccion;
		TlfnoContacto = tlfnoContacto;
		BibliotecaOrigen = bibliotecaOrigen;
		Estado = estado;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
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
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTlfnoContacto() {
		return TlfnoContacto;
	}
	public void setTlfnoContacto(String tlfnoContacto) {
		TlfnoContacto = tlfnoContacto;
	}
	public String getBibliotecaOrigen() {
		return BibliotecaOrigen;
	}
	public void setBibliotecaOrigen(String bibliotecaOrigen) {
		BibliotecaOrigen = bibliotecaOrigen;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	
}
