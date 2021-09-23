package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escriba el primer número: ");
		float numero1 = sc.nextFloat();
		
		System.out.print("Escriba el segundo número: ");
		float numero2 = sc.nextFloat();
		
		System.out.print("Escriba la Operación deseada [1 - 6] : ");
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
			  name = "Multiplicación";
		 break;
		  case 4: 
			  if (numero2 > 0) {
			     resultado = numero1 / numero2;
			     name = "División";
			  } else  {  
				  resultado = 0;
			      name = "No es posible hallar la división";
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
		System.out.println("Número 1......:" + numero1);
		System.out.println("Número 2......:" + numero2); 
		System.out.println("Operación.....:" + name);
		System.out.println("Resultado.....:" + resultado);
		
		
		}
	}


