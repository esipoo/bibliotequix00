package com.everis.biblioteca;

public class Editoriale {
	
	int IDEditorial;
	String NombreEditorial;
	String DirecciónEditorial;
	int[] TlfnoContacto;
	String PersonaContacto;
	
	public Editoriale() {
		super();
	}
	 
	public Editoriale(int iDEditorial, String nombreEditorial,
			String direcciónEditorial, int[] tlfnoContacto,
			String personaContacto) {
		super();
		IDEditorial = iDEditorial;
		NombreEditorial = nombreEditorial;
		DirecciónEditorial = direcciónEditorial;
		TlfnoContacto = tlfnoContacto;
		PersonaContacto = personaContacto;
	}
	public int getIDEditorial() {
		return IDEditorial;
	}
	public void setIDEditorial(int iDEditorial) {
		IDEditorial = iDEditorial;
	}
	public String getNombreEditorial() {
		return NombreEditorial;
	}
	public void setNombreEditorial(String nombreEditorial) {
		NombreEditorial = nombreEditorial;
	}
	public String getDireccionEditorial() {
		return DirecciónEditorial;
	}
	public void setDireccionEditorial(String direcciónEditorial) {
		DirecciónEditorial = direcciónEditorial;
	}
	public int[] getTlfnoContacto() {
		return TlfnoContacto;
	}
	public void setTlfnoContacto(int[] tlfnoContacto) {
		TlfnoContacto = tlfnoContacto;
	}
	public String getPersonaContacto() {
		return PersonaContacto;
	}
	public void setPersonaContacto(String personaContacto) {
		PersonaContacto = personaContacto;
	}
	
	
	

}
