/*
 * tema5Ej7.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 13
    Escribe un programa que lea una lista de diez números y determine cuántos
    son positivos, y cuántos son negativos.

 * 
 */

import java.util.Scanner;

public class tema5Ej13 {	
	public static void main (String args[]) {
     Scanner s=new Scanner(System.in);
     int n=0;
     int auxP=0;
     int auxN=0;
     
     for(int i =1;i<=10;i++){
       System.out.println("Introduce un número");
       n=s.nextInt();
       if(n<0){
         auxN++;
         }else{
           
           auxP++;
           }
      }
      
                 
           System.out.println("El número de positivos son: " + auxP);
           System.out.println("El número de negativos son: " + auxN);
           
  } 
		
}


