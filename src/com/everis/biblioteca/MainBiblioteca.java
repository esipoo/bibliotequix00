package com.everis.biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Software de gestión de bibliotecas
 * @author everis
 */
public class MainBiblioteca {


	public static void main(String[] args) {
		
		int []telefono = {0,1,2,3,4,5,6,7,8};

		Biblioteca bib = new Biblioteca(1, "Biblioteca everis Murcia", 1/*"Murcia"*/, 1234567890, "HPC Murcia", 1);
		Editoriale edit = new Editoriale(99, "Editorial Everiensis",
				"Lorca",telefono,
				"Salva");
		
		
		
		//Fechas:
		Date f1 = new Date();
		Date f2 = new Date(); 
		try {
			SimpleDateFormat dateformat = new SimpleDateFormat("dd/M/yyyy");
			f1 =  dateformat.parse("01/01/2015");
			f2 =  dateformat.parse("01/12/2015");
		}
		catch (ParseException e) {
			System.out.println("Problema con la conversión de fechas: " + e.getMessage());
			System.exit(-1);
		}
		
		bib.AnadirLibro("1", "Aprender Git", "Hanae", f1, 1, 2, 2, 1001001001, 20, true, f2);


		Scanner myScanner = new Scanner(System.in);
		
		int opcion = 0; 
		
		do {
			//MENÚ:
			System.out.println(" # ############################################ #");
			System.out.println(" #                  BIBLIOTEQUIX:               #");
			System.out.println(" # ############################################ #");
			System.out.println(" #  Seleccione una opción:                      #");
			System.out.println(" #  1. Listar libros en estado disponible       #");
			System.out.println(" #  2. Editorial                                #");
			System.out.println(" #  9. Salir                                    #");
			System.out.println(" # ############################################ #");
						
			opcion = myScanner.nextInt();
			
			switch (opcion) {
				case 1: //Listar libros disponibles:
						bib.ListarLibro3(2); 
						System.out.println("");
						break;
				case 2: //Listar Editorial:
					System.out.println(edit.getNombreEditorial());
					System.out.println("");
					break;
				default: 
						System.out.println(" #  --> Opción incorrecta, seleccione otra opción:");
						System.out.println("");
			}
		}
		while (opcion != 9);
		
		
		//Mensaje de FIN:
		System.out.println(" # ############################################ #");
		System.out.println(" #              FIN    BIBLIOTEQUIX:            #");
		System.out.println(" # ############################################ #");
		
		//Cerrar elementos abiertos
		try {
			myScanner.close();
		} catch(Exception ex) {
			System.out.println(" # Error al cerrar 'myScanner': " + ex.getMessage());
			System.exit(-2);
		}
	}

}
