package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escriba su nombre...: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese las horas trabajadas: ");
		float hora = sc.nextFloat();
		
		System.out.println("Ingrese la tarifa por horas: ");
		float tarifa = sc.nextFloat();
		
		System.out.println("Ingrese los minutos de tardanza: ");
		float min = sc.nextFloat();
		
		
		float importe, bono, descuento, meta = 0;
		
		
		importe = hora * tarifa;
		
		if (hora > 60)
			bono = importe * 0.13f;
		else 
			bono = importe * 0.04f;
		
		if (min > 15)
			descuento = importe * 0.03f;
		else
			descuento = 0;
		
		meta = hora / 0.7f;
		
		
		System.out.println("\nResumen ");
		System.out.println("---------");
		System.out.println("Nombre del Empleado.....:" + nombre);
		System.out.println("Horas trabajadas........:" + hora);
		System.out.println("Tarifas por horas.......:" + tarifa);
		System.out.println("Bono....................:" + bono);
		System.out.println("Importe.................:" + importe);
		System.out.println("Descuento...............:" + descuento);
		System.out.println("Meta Alcanzada..........:" + meta + "%");

	}

}
