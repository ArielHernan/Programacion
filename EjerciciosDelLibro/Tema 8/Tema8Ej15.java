/*
 * tema8FunEj15.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 Ejercicio 15
  Muestra los números primos que hay entre 1 y 1000000.
 * 
 */


public class Tema8Ej15 {
	
	public static void main (String args[]) {
    int n=100000;
		for(int i=2;i<n;i++){
      if(misFunciones.Matematicas.esPrimo(i)){
        System.out.printf("%6d",i);
      }
    }
	}
}

