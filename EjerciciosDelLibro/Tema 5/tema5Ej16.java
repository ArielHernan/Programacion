/*
 * tema5Ej16
 * .java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
* 16. Escribe un programa que diga si un número introducido por teclado
* es o no primo. Un número primo es aquel que sólo es divisible entre
* él mismo y la unidad.

 */
public class tema5Ej16 {
	
	public static void main (String args[]) {
		
    System.out.println("introduce un número , te diré si es primo");
    int n=Integer.parseInt(System.console().readLine());
    
    for(int i=1;i<=n;i++){
    if((n%i==0)){
      System.out.println("El número es primo");
      }else{
      System.out.println("El número no es primo");

        }
    }
	}
}

