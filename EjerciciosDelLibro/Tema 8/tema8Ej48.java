/*
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
*Ejercicio 48. 
* Define la función concatena con la siguiente cabecera: public static int[]concatena(int[]a,int[]b)
* Esta función toma dos arrays como parámetros y devuelve un array que es elresultado de concatenar ambos. 
* Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 },concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }
* 
*/

import misArrays.ArrayUni;

public class tema8Ej48 {
	
	public static void main (String args[]) {
		
   int[]a=misArrays.ArrayUni.generaArrayInt(5,1,100);
   int[]b=misArrays.ArrayUni.generaArrayInt(5,1,100);
   
   misArrays.ArrayUni.muestraArrayInt(concatena(a,b));
    
  }
  
  public static int[]concatena(int[]a,int[]b){
    int[] resultado=new int[a.length+b.length];
    
    for(int i=0;i<a.length;i++){
      resultado[i]=a[i];
    }
    for(int i=0;i<b.length;i++){
      resultado[a.length+i]=b[i];
    }
    
    return resultado;
  }
}

