/*
 * Tema8Ej52.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 52
    Implementa la función aleatorioDeArray con la cabecera que se muestra a
    continuación:
    public static int aleatorioDeArray(int[] a)
    Esta función debe devolver un número del array escogido al azar entre todos
    los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
    podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
    prueba.
 */

import misArrays.ArrayUni;
import java.util.Scanner;
public class Tema8Ej52 {
	
	public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("Este programa elige un número aleatorio en un array");
    
    System.out.println("\nINtroduce lalongitud del array:");
    int l=s.nextInt();
    
    System.out.println("\nINtroduce El valor minimo del array:");
    int min=s.nextInt();
    
    System.out.println("\nINtroduce El valor maximo del array:");
    int max=s.nextInt();
  
     int[]a=misArrays.ArrayUni.generaArrayInt(l,min,max);
     System.out.println("\nEL ARRAY GENERADO ES:");
     misArrays.ArrayUni.muestraArrayInt(a);
     
     System.out.println();
     System.out.println("\neL NÚMERO COGIDO AL AZAR ES:    "+aleatorioDeArray(a));
  }
		
    public static int aleatorioDeArray(int[] a){
      return a[(int)(Math.random()*a.length)];
      
    }
    
    
    
	
}

