/*
 * Tema8Ej53.java
 * 
 Implementa una función con nombrenEsimo que busque el número que hay dentro de un array bidimensional en 
* la posición n-ésima contando de izquierdaa derecha y de arriba abajo, como si se estuviera leyendo. 
* El primer elemento es el 0. Si la posición donde se busca no existe en el array, la función debe devolver -1. 
* Se debe entregar tanto el código de la función como el código deprueba que la usa. 
* La cabecera de la función es la siguiente:public static intn Esimo(int[][]n,intposicion)
* Si el array a es el que se muestra a continuación:
* 
* 35 72 24 45 42 60
* 32 42 64 23 41 39
* 98 45 94 11 18 48
* 12 34 56 78 90 12
* 
* nEsimo(a, 0) devuelve 35
* nEsimo(a, 2) devuelve 24
* nEsimo(a, 5) devuelve 60
* nEsimo(a, 6) devuelve 32
* nEsimo(a, 21) devuelve 78
* nEsimo(a, 23) devuelve 12
* nEsimo(a, 24) devuelve -1
* nEsimo(a, 100) devuelve -1 
 */

import misArrays.ArrayBi;
public class Tema8Ej53 {
	
	public static void main (String args[]) {
		
    int[][]arrayBi=misArrays.ArrayBi.generaArrayBiInt(6,4,1,100);
    System.out.println("el array es el siguiente:\n");
    misArrays.ArrayBi.presentaArrayBiInt(arrayBi);
    
    System.out.println("Elige la posicion  n-esima:\n");
    int pos=Integer.parseInt(System.console().readLine());
    
    System.out.println();

    System.out.println("Elnúmero es:\n"+nEsimo(arrayBi,pos));
	}
  
  public static int nEsimo(int[][]n,int posicion){
    int x=posicion/n[0].length;
    int y=posicion%n[0].length;
    
    int solicitado=n[x][y];
    return solicitado;
  }
   
}

