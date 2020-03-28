package com.everis.biblioteca;

import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

public class Biblioteca {

	int IdBiblioteca; //--
	String Nombre;
	int Direccion;
	int TlfnoContacto;
	String PersonaContacto;
	int Horario;
	Vector<Libro> Ls;
	Vector<Author> As;
	Vector<Editoriale> Es;
	Vector<Usuario> Us;
	Vector<PrestamosLibro> Ps;
	
	public Biblioteca() {
		super();
	}
	public Biblioteca(int idBiblioteca, String nombre, int direccion,
			int tlfnoContacto, String personaContacto, int horario) {
		super();
		IdBiblioteca = idBiblioteca;
		Nombre = nombre;
		Direccion = direccion;
		TlfnoContacto = tlfnoContacto;
		PersonaContacto = personaContacto;
		Horario = horario;
		
		Ls = new Vector<Libro>();
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getDireccion() {
		return Direccion;
	}
	public void setDireccion(int direccion) {
		this.Direccion = direccion;
	}
	public int getTlfnoContacto() {
		return TlfnoContacto;
	}
	public void setTlfnoContacto(int tlfnoContacto) {
		this.TlfnoContacto = tlfnoContacto;
	}
	public String getPersonaContacto() {
		return PersonaContacto;
	}
	public void setPersonaContacto(String personaContacto) {
		this.PersonaContacto = personaContacto;
	}
	public int getHorario() {
		return Horario;
	}
	public void setHorario(int horario) {
		this.Horario = horario;
	}

	public void anadirLibro(Libro L){
		this.Ls.add(L);
	}
	public void ListarLibro1(String Auth){
		for(int i=0; i<Ls.size(); i++)
		{ if(Ls.elementAt(i).getAuthor().equals(Auth))
			System.out.println (i+"=>"+Ls.elementAt(i).ISBN+","+Ls.elementAt(i).Nombre+","+Ls.elementAt(i).Editorial+","+Ls.elementAt(i).FechaEdicion+","+Ls.elementAt(i).Estado+".");
		}}
	public void ListarLibro2(int edit){
		for(int i=0; i<Ls.size(); i++)
		{ if(Ls.elementAt(i).getEditorial()==edit)
			System.out.println (i+"=>"+Ls.elementAt(i).ISBN+","+Ls.elementAt(i).Nombre+","+Ls.elementAt(i).Editorial+","+Ls.elementAt(i).FechaEdicion+","+Ls.elementAt(i).Estado+".");
		}}
	public void ListarLibro3(int estado){
		for(int i=0; i<Ls.size(); i++)
		{ if(Ls.elementAt(i).getEstado()==estado){
			System.out.println (i+"=>"+Ls.elementAt(i).ISBN+","+Ls.elementAt(i).Nombre+","+Ls.elementAt(i).Editorial+","+Ls.elementAt(i).FechaEdicion+","+Ls.elementAt(i).Estado+".");
		}}}
	public void BuscarLibro(String Nomb, String ISBN){
		for(int i=0; i<Ls.size(); i++)
		{ if(Ls.elementAt(i).getNombre().equals(Nomb) && Ls.elementAt(i).getISBN().equals(ISBN)){
			System.out.println (i+"=>"+Ls.elementAt(i).ISBN+","+Ls.elementAt(i).Nombre+","+Ls.elementAt(i).Editorial+","+Ls.elementAt(i).FechaEdicion+","+Ls.elementAt(i).Estado+".");
		}}
	}	
	public void prestarLibro(){
		for(int i=0; i<Ls.size(); i++)
		{ if(Ls.elementAt(i).getEstado()==1){
			System.out.println (i+"=>"+Ls.elementAt(i).ISBN+","+Ls.elementAt(i).Nombre+","+Ls.elementAt(i).Editorial+","+Ls.elementAt(i).FechaEdicion+","+Ls.elementAt(i).Estado+".");
		}}
	}

	public void AnadirAuthor(String idAuthor,String NombreAuthor,String Apellido1,String Apellido2,Date FechaNacimiente,String Cuidad,String DescripcionAuthor){
		Author a=new Author(idAuthor,NombreAuthor,Apellido1,Apellido2,FechaNacimiente,Cuidad,DescripcionAuthor);
		As.add(a);
	}
	public void ModificarAuthor(String idAuth, String idAutho, String NombreAuthor, String Apel1, String Apel2,Date FechaNacimiente, String Cuidad,String DescriptionAuthor){
		for(int i=0; i<As.size(); i++)
		{ if(As.elementAt(i).idAuthor.equals(idAuth)){
			this.As.get(i).setIdAuthor(idAutho);
			this.As.get(i).setNombreAuthor(NombreAuthor);
			this.As.get(i).setApellido1(Apel1);
			this.As.get(i).setCuidad(Cuidad);
			this.As.get(i).setFechaNacimiente(FechaNacimiente);
			this.As.get(i).setCuidad(Cuidad);
			this.As.get(i).setDescripcionAuthor(DescriptionAuthor);
		}}}
	public void ListarAuthors(){
		for(int i=0; i<As.size(); i++)
			System.out.println(this.As.get(i).getNombreAuthor()+","+this.As.get(i).getApellido1()+","+this.As.get(i).getApellido2()+","+this.As.get(i).getCuidad()+","+this.As.get(i).getDescripcionAuthor());
	}

	public void AnadirLibro(String ISBN,String Nombre,String auth,Date FechaEdicion,int Editorial,int Estado,int clasificat, int ubicacion, int DiasPre, boolean dispo,Date FechaPrestamo){
		Libro b=new Libro(ISBN,Nombre,auth,Editorial,FechaEdicion,Estado,clasificat,ubicacion,dispo,DiasPre,FechaPrestamo);
		Ls.add(b);
	}


	public void ModificarLibro(String id,String iSBN , String nombre, String author, int editorial,
			Date fechaEdicion, int estado, int clasification, int ubicacion,
			Boolean disponible, int dias,Date fechaPremato){
		for(int i=0; i<Ls.size(); i++)
		{ if(Ls.elementAt(i).ISBN.equals(id)){
			this.Ls.get(i).setISBN(iSBN);
			this.Ls.get(i).setNombre(nombre);
			this.Ls.get(i).setAuthor(author);
			this.Ls.get(i).setEditorial(editorial);
			this.Ls.get(i).setFichaEdicion(fechaEdicion);
			this.Ls.get(i).setEstado(estado);
			this.Ls.get(i).setClasification(clasification);
			this.Ls.get(i).setDisponible(disponible);
			this.Ls.get(i).setDias(dias);

		}}}

	public void AnadirEditoriale(int iDEditorial, String nombreEditorial,String direccionEditorial, int[] tlfnoContacto,String personaContacto){
		Editoriale e=new Editoriale(iDEditorial, nombreEditorial,direccionEditorial, tlfnoContacto,personaContacto);
		Es.add(e);
	}

	public void ModificarEditoriale(int id,int iDEditorial, String nombreEditorial,String direccionEditorial, int[] tlfnoContacto,String personaContacto){
		for(int i=0; i<Es.size(); i++)
		{ if(Es.elementAt(i).IDEditorial==id ){
			this.Es.get(i).setIDEditorial(iDEditorial);
			this.Es.get(i).setNombreEditorial(nombreEditorial);
			this.Es.get(i).setDireccionEditorial(direccionEditorial); 
			this.Es.get(i).setPersonaContacto(PersonaContacto); 
			this.Es.get(i).setTlfnoContacto(tlfnoContacto);
		}}}
	public void ListarEditoriale(){
		for(int i=0; i<Es.size(); i++)
			System.out.println(this.Es.get(i).getIDEditorial() +","+this.Es.get(i).getNombreEditorial() +","+this.Es.get(i).getDireccionEditorial()+","+this.Es.get(i).getPersonaContacto()+","+this.Es.get(i).getTlfnoContacto());
	}

	public void AnadirUsuario(String dNI, String nombre,String apellido1, String apellido2,String direccion,String tlfnoContacto,String bibliotecaOrigen,int estado){
		Usuario u=new Usuario(dNI,nombre, apellido1,  apellido2,direccion, tlfnoContacto,bibliotecaOrigen,estado);
		Us.add(u);
	}

	public void ModificarUsuario(String idu,String DNI, String nombre,String apellido1, String apellido2,String direccion,String tlfnoContacto,String bibliotecaOrigen,int estado){
		for(int i=0; i<Us.size(); i++)
		{ if(Us.elementAt(i).DNI.equals(idu)){
			this.Us.get(i).setDNI(DNI);
			this.Us.get(i).setNombre(nombre);
			this.Us.get(i).setApellido1(apellido1); 
			this.Us.get(i).setApellido2(apellido2); 
			this.Us.get(i).setDireccion(direccion);
			this.Us.get(i).setTlfnoContacto(tlfnoContacto);
			this.Us.get(i).setBibliotecaOrigen(bibliotecaOrigen);
			this.Us.get(i).setEstado(estado);

		}}}
	public void ListarUsuario(){
		for(int i=0; i<Us.size(); i++)
			System.out.println(this.Us.get(i).getDNI() +","+this.Us.get(i).getNombre() +","+this.Us.get(i).getApellido1()+","+this.Us.get(i).getApellido2()+","+this.Us.get(i).getDireccion()+","+this.Us.get(i).getTlfnoContacto()+","+this.Us.get(i).getBibliotecaOrigen()+","+this.Us.get(i).getEstado());

	}
	public void PrestarLibro(Libro L, Usuario U){
		if(L.getDisponible() && U.getEstado()==1){
			Calendar cal1 = Calendar.getInstance();
			Date date1 =  cal1.getTime();
			///////////
			//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			cal1.add(Calendar.DATE, L.getDias());
			Date date2=cal1.getTime();
			//////////
			PrestamosLibro PL=new PrestamosLibro(L.getISBN(),U.getDNI(),date1,date2,1,null);
			Ps.add(PL);
			// PL.setFechaDevolucion(        ); // reglé date1+dias
			for(int i=0; i<Ls.size(); i++)
				if(Ls.elementAt(i).getISBN().equals(L.getISBN()))
				{
					L.setEstado(1);
					L.setEstado(1);
					L.setDisponible(false);
				}
			for(int i=0; i<Us.size(); i++)
				if(Us.elementAt(i).getDNI().equals(U.getDNI()))
					U.setEstado(2);

		}}


	public void devolvarLibro(Libro L, Usuario U){
		if(! L.getDisponible())
		{Calendar cal1 = Calendar.getInstance();
		Date date1 =  cal1.getTime();
		for(int i=0; i<Ps.size(); i++)
		{ if(Ps.elementAt(i).getISBN_Libro().equals(L.getISBN()) && Ps.elementAt(i).getDNI_Usuario().equals(U.getDNI())){
			this.Ps.get(i).setEstadoPrestamo(2);
			this.Ps.get(i).setFechaDefinitivaDevolucion(date1);
			for(int i1=0; i1<Ls.size(); i1++)
				if(Ls.elementAt(i1).getISBN().equals(L.getISBN())){
					this.Ls.get(i).setDisponible(true);
					this.Ls.get(i).setEstado(1);
				}
			for(int i1=0; i1<Us.size(); i1++)
				if(Us.elementAt(i1).getDNI().equals(U.getDNI()))
					Us.elementAt(i1).setEstado(2); // bloquedo

		}
		}}}
}


