/*
 * ej4ClaseT4.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
  *Programa que escriba por pantalla la tabla de potencias de un número 
  * introducido por teclado.
  * También se ha de pedir por teclado la cdntidad de filas que 
  * ha de tener la tabla de potencias .
  * La tebla de potencias empezará por el primer número  elevado a la primera potencia (1) ,
  * después lo hará elevado a la segunda
  * potencia (2) y así hasta llegar al segundo número.
  * 
 */

import java.util.Scanner;
public class ej4ClaseT4 {
	
	public static void main (String args[]) {
    
    int n=0;
    int filas=0;
    int r = 1;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa calcula la potencia de un número");
    
    System.out.println("introduce el número:");
    n= s.nextInt();
    
    System.out.println("introduce las filas:");
    filas= s.nextInt();
    
    System.out.println(" ");
    
    for(int i =1;i<=filas;i++){
      r=n*r;
      System.out.println(r);
      }

    
		
	}
}

