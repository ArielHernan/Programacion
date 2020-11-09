/*
 * tema6Ej1.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 1
    Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
    también la suma total (los puntos que suman entre los tres dados).
 */


public class tema6Ej1 {
	
	public static void main (String args[]) {
    
    int suma=0;
    int n=0;
    
    System.out.println("Este programa muestre la tirada de tres dados. Se debe mostrar también la suma total");
    System.out.println();
    
    for(int i =0; i<3;i++){
      
      n= (int)((Math.random()*6) + 1);
      suma=suma+n;
      System.out.print( n + " ");      
      }
      
      System.out.println();
      
      System.out.print(suma);

    
    
    
    
		
	}
}

