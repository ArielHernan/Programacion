/*
 * tema8FunEj29_34.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 */

import misArrays.ArrayUni;
import misArrays.ArrayBi;
import misFunciones.Matematicas;
import java.util.Scanner;
public class tema8Ej29_34 {
	
	public static void main (String args[]) {
		
  Scanner s=new Scanner(System.in);
  System.out.println("Este programa genera un array");
  System.out.println();
  
  
  int[][] array=misArrays.ArrayBi.generaArrayBiInt(10,10,1,100);
  
  
  misArrays.ArrayBi.presentaArrayBiInt(array);
  System.out.println();
  System.out.println();
  
  
  System.out.println("Devuelve la fila i-ésima del array que se pasa como parámetro.");
  System.out.println("Introduce la fila del array bidimensional que quieras imprimir:");
  int fila= s.nextInt();
  System.out.println("La fila es:");
  misArrays.ArrayUni.muestraArrayInt(ArrayBi.filaDeArrayBiInt(array, fila));  
  System.out.println();
  System.out.println();
  
  
  System.out.println("Devuelve la columna j-ésima del array que se pasa como parámetro.");
  System.out.println("Introduce la columna del array bidimensional que quieras imprimir:");
  int columna= s.nextInt();
  misArrays.ArrayUni.muestraArrayInt(ArrayBi.columnaDeArrayBiInt(array, columna));
  System.out.println();
  System.out.println();
  
  
  System.out.println("Devuelve la fila y la columna (en un array con dos elementos)\nde la primera ocurrencia de un número dentro de un array bidimensional.\nSi el número no se encuentra en el array, la función\ndevuelve el array {-1, -1}."); 
  System.out.println("Elige el número dentro del array y te daré fila y columna donde se encuentra");
  int numero= s.nextInt();
  System.out.println("Las coordenadas son:");
  misArrays.ArrayUni.muestraArrayInt(misArrays.ArrayBi.coordenadasEnArrayBiInt(array, numero));
  System.out.println();
  System.out.println();
  
  
  System.out.println("Dice si un número es o no punto de silla, es decir\nmínimo en su fila y máximo en su columna.");
  System.out.println("Elige la fila dentro del array ");
  fila=s.nextInt();
  System.out.println("Elige la columna dentro del array ");
  columna=s.nextInt();

  if(misArrays.ArrayBi.esPuntoDeSilla(array,fila,columna)){
      System.out.println(" el número "+array[fila][columna]+ " es punto de silla");
  }else{
    System.out.println(" el número "+array[fila][columna]+ " NO es punto de silla");
  }
  System.out.println();
  System.out.println();
  misArrays.ArrayBi.presentaArrayBiInt(array);
  System.out.println();
  System.out.println("Este programa dice la diagonal, debes introducir la fila , la columna y la dirección");
  System.out.println("Elige la fila dentro del array ");
  fila=s.nextInt();
  System.out.println("Elige la columna dentro del array ");
  columna=s.nextInt();
  System.out.println("Elige la dirección (nose) o (neso) dentro del array ");
  String direccion=s.next();
  System.out.println();
  misArrays.ArrayUni.muestraArrayInt(misArrays.ArrayBi.diagonal(array,fila,columna,direccion));
  

	}
}

