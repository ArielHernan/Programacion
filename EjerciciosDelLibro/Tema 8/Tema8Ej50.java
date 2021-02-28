/*
 * Tema8Ej50.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
   Ejercicio 50
  Define la función mezcla con la siguiente cabecera:
  public static int[] mezcla(int[] a, int[] b)
  Esta función toma dos arrays como parámetros y devuelve un array que es
  el resultado de mezclar los números de ambos de forma alterna, se coge un
  número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
  longitudes diferentes; por tanto, si se terminan los números de un array se
  terminan de coger todos los que quedan del otro.
  Ejemplos:
  Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
  Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
  Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
  Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
 * 
 */
import misArrays.ArrayUni;
import java.util.Scanner;
public class Tema8Ej50 {
	
	public static void main (String args[]) {
    
    int[] array1=misArrays.ArrayUni.generaArrayInt(15,1,100);
    int[] array2=misArrays.ArrayUni.generaArrayInt(15,1,100);
    
    System.out.println("El primer array es:");
    misArrays.ArrayUni.muestraArrayInt(array1);
    
    System.out.println();
    
    System.out.println("El segundo array es:");
    misArrays.ArrayUni.muestraArrayInt(array2);
    
    System.out.println();

    System.out.println("El array mezclado alternativamente  es:");
    misArrays.ArrayUni.muestraArrayInt(mezcla(array1,array2));
	}
  
  
  public static int[] mezcla(int[] a, int[] b){
    
    int[] arrayFinal=new int[a.length+b.length];
    int contadorPosicionArrayFinal=0;
    int contadorPosicionArraya=0;
    int contadorPosicionArrayb=0;
    
    for(int i=0;i<arrayFinal.length;i++){      
      if(contadorPosicionArraya<a.length){
      
        arrayFinal[contadorPosicionArrayFinal]=a[contadorPosicionArraya];
        
        contadorPosicionArrayFinal++;
        contadorPosicionArraya++;
      }
      
      if(contadorPosicionArrayb<b.length){
      
        arrayFinal[contadorPosicionArrayFinal]=b[contadorPosicionArrayb];
        
        contadorPosicionArrayFinal++;
        contadorPosicionArrayb++;
      } 
    }
    return arrayFinal;
  }
}

