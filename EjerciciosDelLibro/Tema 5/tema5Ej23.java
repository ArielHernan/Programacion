/*
 * tema5Ej23.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.

 */


public class tema5Ej23 {
	
	public static void main (String args[]) {
		
    int n=0;
    int suma=0;
    int contador=0;
    int media=0;
    System.out.println("Este programa pide números hasta llegar a 1000, arroja un contador de los números introducidos, la suma y la media");
    
    while(suma<10000){
    System.out.println("Introduce un número: ");
    n=Integer.parseInt(System.console().readLine());
    suma=suma+n;
    contador++;
    if(suma>10000){
    suma=suma-n;
    System.out.println("El último número introducido da una suma mayor a 10000, por  favor introduce uno menor");
    }
      }
     
     media=suma/contador; 
    System.out.println("Total acumulado: " + suma + " número de números introducidos; " + (contador) + " medida: " + media);
    
	}
}

