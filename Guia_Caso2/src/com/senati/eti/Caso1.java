package com.senati.eti;

import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int edad = 0;
		
		System.out.println("Ingrese edad: ");
		edad = sc.nextInt();
		
		if (edad >= 18)
			System.out.println("Mayor de edad");
		else
			System.out.println("Menor de edad");

	}

}
