package com.everis.biblioteca;

import java.util.Date;

public class PrestamosLibro {
	String ISBN_Libro;
	String DNI_Usuario;
	Date FechaPrestamo;	
	Date FechaDevoluci�n;
	int EstadoPrestamo;
	Date FechaDefinitivaDevolucion;
	
	public PrestamosLibro() {
		super();
	}
	
	public PrestamosLibro(String iSBN_Libro, String dNI_Usuario,
			Date fechaPrestamo, Date fechaDevoluci�n, int estadoprestamo,
			Date fechaDefinitivaDevolucion) {
		super();
		
		this.ISBN_Libro = iSBN_Libro;
		this.DNI_Usuario = dNI_Usuario;
		this.FechaPrestamo = fechaPrestamo;
		this.FechaDevoluci�n = fechaDevoluci�n;
		this.EstadoPrestamo = estadoprestamo;
		this.FechaDefinitivaDevolucion = fechaDefinitivaDevolucion;
	}
	public String getISBN_Libro() {
		return ISBN_Libro;
	}
	public void setISBN_Libro(String iSBN_Libro) {
		ISBN_Libro = iSBN_Libro;
	}
	public String getDNI_Usuario() {
		return DNI_Usuario;
	}
	public void setDNI_Usuario(String dNI_Usuario) {
		DNI_Usuario = dNI_Usuario;
	}
	public Date getFechaPrestamo() {
		return FechaPrestamo;
	}
	public void setFechaPrestamo(Date FechaPrestamo) {
		this.FechaPrestamo = FechaPrestamo;
	}
	public Date getFechaDevoluci�n() {
		return FechaDevoluci�n;
	}
	public void setFechaDevoluci�n(Date fechaDevoluci�n) {
		this.FechaDevoluci�n = fechaDevoluci�n;
	}
	public int getEstador�stamo() {
		return EstadoPrestamo;
	}
	public void setEstadoPrestamo(int estadoPrestamo) {
		this.EstadoPrestamo = estadoPrestamo;
	}
	public Date getFechaDefinitivaDevolucion() {
		return FechaDefinitivaDevolucion;
	}
	public void setFechaDefinitivaDevolucion(Date fechaDefinitivaDevolucion) {
		this.FechaDefinitivaDevolucion = fechaDefinitivaDevolucion;
	}

	


}
