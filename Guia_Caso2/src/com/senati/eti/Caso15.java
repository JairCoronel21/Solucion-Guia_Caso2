package com.senati.eti;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  
   String cliente, producto, forma,  nombre, pago = "";
   int cantidad, precio, importe = 0;
   float descuento, incremento, total = 0;
   
   
   
    System.out.print("Ingrese Cliente...: ");
	cliente = sc.nextLine();
	
	System.out.print("Ingrese producto [TB / LT / MN / IM]: ");
	producto = sc.nextLine();
	
	System.out.print("Ingrese forma de pago [C1 / C2]: ");
	forma = sc.nextLine();
	
	System.out.print("Ingrese cantidad: ");
    cantidad = sc.nextInt();
		
    
		
    
    switch (producto) {
     case "TB":
		 nombre = "Tablet";
		 precio = 350;
		 break;
     case "LT":
		 nombre = "Laptop";
		 precio = 2300;
		 break;
     case "MN":
		 nombre = "Monitor";
		 precio = 850;
		 break;
     case "IM":
		 nombre = "Impresora";
		 precio = 680;
	     break;
     default:
		 nombre = "Desconocido";
		 precio = 0;
    }
    
    importe = precio * cantidad;
	
    System.out.println("\nResultados ");
    System.out.println("---------");
    System.out.println("Cliente.................:" + cliente);
    System.out.println("Producto................:" + nombre);
    System.out.println("Precio..................:" + precio);
    System.out.println("Cantidad................:" + cantidad);
    System.out.println("Importe.................:" + importe);
    
    switch (forma) {
     case "C1":
		  pago = "Contado";
		  descuento = importe * 0.05f;
		  total = importe - descuento;
		  System.out.println("Descuento........: " + descuento);
		  break;
    case "C2":
		  pago = "Crédito";
		  incremento = importe * 0.12f;
		  total = importe + incremento;
		  System.out.println("Incremento.......: " + incremento);
		  break;
    default:
    	  pago = "Desconocido";
		  incremento = 0;
		  total = 0;
		  
    
    
    
    }
		
		
		

	System.out.println("Forma de pago...........:" + pago);
    System.out.println("Total a pagar...........:" + total);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
	}

