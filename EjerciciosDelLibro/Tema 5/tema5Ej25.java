/*
 * tema5Ej25.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 25
Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 */


public class tema5Ej25 {
	
	public static void main (String args[]) {
    
    System.out.println("Introduce un número");
    int n=Integer.parseInt(System.console().readLine());
    int alreves=0;
    
    while(n>0){
      alreves=(alreves*10)+(n%10);
      n=n/10;
      }
    System.out.println("El número al revés es: "+alreves);
		
	}
}

