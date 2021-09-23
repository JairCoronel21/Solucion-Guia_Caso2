package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float precio = 0;
		
		System.out.print("Ingrese precio: ");
		precio = sc.nextFloat();
		
		int cantidad = 0;
		
		System.out.print("Ingrese cantidad: ");
		cantidad = sc.nextInt();
		
		float descuento = 0;
		
		float total = (float) (precio * cantidad);
		
		
		
		if (cantidad > 8)
			descuento = (float) (0.1 * total);
		else
			descuento = 0;
			
		float neto = (float) (total - descuento);
		
		System.out.println("\nResultados");
		System.out.println("---------");
		System.out.println("Total: " + total);
		System.out.println("Descuento: " + descuento);
		System.out.println("Neto: " + neto);
		
		
		
		
		
		

	}

}
