package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Ingrese un n?mero: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0)
			System.out.print("El n?mero " + numero + " es par ");
		else
			System.out.print("El n?mero " + numero + " es impar ");
				
		

	}

}
