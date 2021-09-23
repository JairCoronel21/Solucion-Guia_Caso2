package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escriba el primer n�mero: ");
		float numero1 = sc.nextFloat();
		
		System.out.print("Escriba el segundo n�mero: ");
		float numero2 = sc.nextFloat();
		
		System.out.print("Escriba la Operaci�n deseada [1 - 6] : ");
		int operacion = sc.nextInt();

		float resultado = 0;
		String name = "";
		
		
		switch (operacion) {
		  case 1:
			  resultado = numero1 + numero2;
			  name = "Suma";
			  break;
		  case 2:
			  resultado = numero1 - numero2;
			  name = "Resta";
			  break;
		  case 3:
			  resultado = numero1 * numero2;
			  name = "Multiplicaci�n";
		 break;
		  case 4: 
			  if (numero2 > 0) {
			     resultado = numero1 / numero2;
			     name = "Divisi�n";
			  } else  {  
				  resultado = 0;
			      name = "No es posible hallar la divisi�n";
			  }  break; 
		  case 5: 
			  if (numero2 > 0) {
				  resultado = numero1 % numero2;
			      name = "Resto Entero";
		} else {   
			      resultado = 0;
				  name = "No es posible hallar el resto entero";
			      }break;
		  case 6:
			   resultado = (numero1 + numero2) / 2;
			   name = "Promedio";
		       break;
		
		
		}	
		
		
		System.out.println("\nResultados");
		System.out.println("---------");
		System.out.println("N�mero 1......:" + numero1);
		System.out.println("N�mero 2......:" + numero2); 
		System.out.println("Operaci�n.....:" + name);
		System.out.println("Resultado.....:" + resultado);
		
		
		}
	}


