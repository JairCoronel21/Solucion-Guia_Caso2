package com.senati.eti;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre del alumno...: ");
		String alumno = sc.nextLine();
		
		System.out.print("Carrera [DS - RC - DG]: ");
		String carrera = sc.nextLine();
		
		System.out.print("Turno [M - T - N]: ");
		String turno = sc.nextLine();
		
		String nombre_carrera = "", nombre_turno = "";
		float monto = 0, dscto = 0, total_sol = 0, total_dol = 0;
	
		switch (carrera) {
		   case "DS":
			   nombre_carrera = "Desarrollo de Software";
			   monto = 1500;
		       break;
		   case "RC":
			   nombre_carrera = "Redes y Conectividad";
			   monto = 1400;
			   break;
		   case "DG":
			   nombre_carrera = "Diseño Grafico";
			   monto = 1300;
			   break;
		   default:
			   nombre_carrera = "Desconocido";
			   monto = 0;
			}
		
		switch (turno) {
		    case "M":
		    	nombre_turno = "Mañana";
		    	dscto = 0.1f * monto;
		    	break;
		    case "T":
		    	nombre_turno = "Tarde";
		    	dscto = 0.2f * monto;
		    	break;
		    case "N":
		    	nombre_turno = "Noche";
		    	dscto = 0.15f * monto;
		    	break;
		    default:
		    	nombre_turno = "Desconocido";
		    	dscto = 0;
		}   	

	    total_sol = monto - dscto;
	    total_dol = total_sol / 4;
	    
	    System.out.println("\nResultados ");
		System.out.println("---------");
		System.out.println("Alumno.................:" + alumno);
		System.out.println("Carrera................:" + nombre_carrera);
		System.out.println("Turno..................:" + nombre_turno);
		System.out.println("Monto..................:" + monto);
		System.out.println("Descuento Aplicado.....:" + dscto);
		System.out.println("Total a pagar(soles)...:" + total_sol);
		System.out.println("Total a pagar(dolares).:" + total_dol);
 
		
		
	}	
}
