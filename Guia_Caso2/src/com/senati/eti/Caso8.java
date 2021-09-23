package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nota: ");
		int nota = sc.nextInt();
		
		
		String mensaje = "";
		
		if (nota <= 7)
		     mensaje = "Sin palabras";
		else if (nota <= 10)
		     mensaje = "Malo";
		else if (nota <= 14)
		     mensaje = "Regular";
		else if (nota <= 17)
		     mensaje = "Notable";
		else if (nota <= 20)
		     mensaje = "Excelente";
		else
			mensaje = "No es una nota existente";
		
		System.out.println("\nResultados");
		System.out.println("---------");
		System.out.println("Resumen de nota: " + nota);
		System.out.println("Estado Obtenido: " + mensaje);
		             
		      

	}

}
