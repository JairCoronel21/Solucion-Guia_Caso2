package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el  n�mero 1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Ingrese el  n�mero 2: ");
		int n2 = sc.nextInt();
		
		String mensaje = "";
		
		// Condicional anidada
		if (n1 == n2)
		    mensaje = "Los dos n�meros son iguales";
		    else if (n1 < n2)
		    	mensaje = "El primer n�mero es menor";
		    else
		    	mensaje = "El segundo n�mero es menor";
		
		System.out.println("\nResultados ");
		System.out.println("---------");
		System.out.println("Resultado.........:" + mensaje);

	}

}
