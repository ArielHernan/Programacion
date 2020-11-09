/*
 * tema6Ej4.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 4
    Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 */


public class tema6Ej4 {
	
	public static void main (String args[]) {
		
    for(int i=0;i<20;i++){
    int n= (int)(Math.random()*11);
    System.out.print(n + " ");
  }
    
	}
}

