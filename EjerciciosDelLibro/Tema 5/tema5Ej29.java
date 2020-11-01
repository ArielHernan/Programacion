/*
 * tema5Ej29.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejercicio 29
Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.
 */

import java.util.Scanner;
public class tema5Ej29 {
	
	public static void main (String args[]) {
    
		Scanner s=new Scanner(System.in);
    System.out.println("introduce in numero");
    int n=s.nextInt();
    
    System.out.println("introduce otro numero");
    int n2=s.nextInt();
    
    for(int i =1;i<=n;i++){
      
      if(i%n2==0){
        System.out.println(i+" ");
        }
      
      }
	}
}

