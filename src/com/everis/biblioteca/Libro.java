package com.everis.biblioteca;

import java.util.Calendar;
import java.util.Date;

public class Libro {
	String ISBN;
	String Nombre;
	String Author;
	int Editorial;
	Date FechaEdicion;
	int Estado;
	int Clasification;
	int[] Ubicacion;
	Boolean Disponible;
	int DiasPrestamo;
	Date FechaPrestato;

	public Libro() {
		super();
	}
	public Libro(String iSBN, String nombre, String author, int editorial,
			Date fechaEdicion, int estado, int clasification, int ubicacion,
			Boolean disponible, int dias,Date FechaPrestato) {
		super();
		ISBN = iSBN;
		Nombre = nombre;
		Author = author;
		Editorial = editorial;
		FechaEdicion = fechaEdicion;
		Estado = estado;
		Clasification = clasification;
		//	Ubicacion = ubicacion;
		Disponible = disponible;
		DiasPrestamo = dias;
		FechaPrestato=FechaPrestato;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getEditorial() {
		return Editorial;
	}
	public void setEditorial(int editorial) {
		Editorial = editorial;
	}
	public Date getFichaEdicion() {
		return FechaEdicion;
	}
	public void setFichaEdicion(Date fichaEdicion) {
		FechaEdicion = fichaEdicion;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	public int getClasification() {
		return Clasification;
	}
	public void setClasification(int clasification) {
		Clasification = clasification;
	}
	//public int getUbicacion() {
	//return Ubicacion;
	//}
	//public void setUbicacion(int ubicacion) {
	//	Ubicacion = ubicacion;
	//}
	public Boolean getDisponible() {
		return Disponible;
	}
	public void setDisponible(Boolean disponible) {
		Disponible = disponible;
	}
	public int getDias() {
		return DiasPrestamo;
	}
	public void setDias(int dias) {
		DiasPrestamo = dias;
	}

	public void Anadir(String iSBN, String nombre, String author, int editorial,Date fechaEdicion, int estado, int clasification, int ubicacion,int dias,Date FechaPrestato){
		Libro L=new Libro( iSBN,nombre, author, editorial,fechaEdicion, estado,clasification, ubicacion,true,dias, FechaPrestato);

		if(this.Estado==4)
			this.Estado=2;

	}
	public void Comparar(){
		this.Estado=4;
	}
	public void DardeBaja(){
		if(this.Estado==1){
			Calendar cal1 = Calendar.getInstance();
			//Date currentDate = cal.getTime();
			//int year1=cal.get(Calendar.YEAR);
			//int month1=cal.get(Calendar.MONTH);
			//int day1=cal.get(Calendar.DAY_OF_MONTH);
			// int year2=(this.FechaPrestato).getTimeInMillis();
			// now = Calendar.getInstance(); 
			//Calendar cal1 = Calendar.getInstance();
			Date date1 =  cal1.getTime();
			Date date2=this.FechaPrestato;
			// cal2.setTime(this.FechaPrestato);
			long diferenciaMillis=date1.getTime()-date2.getTime();
			long diasPrestamo=this.DiasPrestamo*24*3600;
			if (diferenciaMillis>diasPrestamo) this.Estado=3;

		}
	}
	public void Organizar(int g,int p,int e, int s){
		//int h=g-(g/10);
		int y=p-(p/10);
		int z=e-(e/10);
		int o=s-(s/10);
		//this.Ubicacion [1]=h;
		//this.Ubicacion [2]=h/10;
		//this.Ubicacion [3]=h/100;
		//this.Ubicacion [4]=h/1000;
		this.Ubicacion [5]=y;
		this.Ubicacion [6]=p/10;
		this.Ubicacion [7]=z;
		this.Ubicacion [8]=e/10;
		this.Ubicacion [9]=e/100;
		this.Ubicacion [10]=o;
		this.Ubicacion [11]=s/10;
		this.Ubicacion [12]=s/100;
	}

}

