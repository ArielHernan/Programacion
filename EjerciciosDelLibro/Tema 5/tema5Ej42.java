/*
 * tema5Ej42.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 42
    Escribe un programa que pida un número entero positivo por teclado y que
    muestre a continuación los 5 números consecutivos a partir del número
    introducido. Al lado de cada número se debe indicar si se trata de un primo
    o no.
    Ejemplo:
    Por favor, introduzca un número entero positivo: 17
    17 es primo
    18 no es primo
    19 es primo
    20 no es primo
    21 no es primo
 */


public class tema5Ej42 {
	
	public static void main (String args[]) {
		System.out.println("Este programa pide un número entero positivo por teclado y que muestre a continuación los 5 números consecutivos a partir del número    introducido. Al lado de cada número se debe indicar si se trata de un primo o no.");
    System.out.println("Introduce un número: ");
    
    int n=Integer.parseInt(System.console().readLine());
    boolean esprimo;
    
    for(int i=n;i<=n+5;i++){
      esprimo=true;
      for(int j=2;j<i;j++){
        if(i%j==0){
          esprimo=false;
          }
        }
      if(esprimo){
        System.out.println("El número " + i + " es primo");
       }else{
        System.out.println("El número " + i + "  NO es primo");
         
         }
      }
    
	}
}

