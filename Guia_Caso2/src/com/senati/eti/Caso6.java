package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el sueldo: ");
		float sueldo = sc.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo > 2800)
            impuesto = (float) (sueldo * 0.05);
		else
			impuesto = (float) (sueldo * 0.02);
		
		System.out.println("\nResultados ");
		System.out.println("---------");
		System.out.println("El impuesto calculado es.........:" + impuesto);
		
	}

}
