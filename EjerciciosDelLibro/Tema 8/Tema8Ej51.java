/*
 * Tema8Ej51.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 51
    Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A
    continuación, el programa indicará para cada uno de ellos si es un número
    primo y/o un capicúa de la forma que muestra el ejemplo.
    Ejemplos:
    Array generado:
    19 22 57 11 3 52 32 46 2 14
    El 19 es primo y no es capicúa.
    El 22 no es primo y es capicúa.
    El 57 no es primo y no es capicúa.
    El 11 es primo y es capicúa.
    El 3 es primo y es capicúa.
    El 52 no es primo y no es capicúa.
    El 32 no es primo y no es capicúa.
    El 46 no es primo y no es capicúa.
    El 2 es primo y es capicúa.
    14 no es primo y no es capicúa.

 */

import misFunciones.Matematicas;
import misArrays.ArrayUni;
import misArrays.ArrayBi;
public class Tema8Ej51 {
	
	public static void main (String args[]) {
    
   int[] array= misArrays.ArrayUni.generaArrayInt(10,2,100);
    misArrays.ArrayUni.muestraArrayInt(array);
    
		System.out.println();
    
    for(int n:array){
      if(misFunciones.Matematicas.esPrimo(n)){
        System.out.print("El numero "+n+" es primo");
      }else{
          System.out.print("El numero "+n+" NO es primo");
       }
       
       if(misFunciones.Matematicas.esCapicua(n)){
        System.out.println(" Y es capicua");
      }else{
          System.out.println(" y NO es capicua");
       }
    }
	}
}

