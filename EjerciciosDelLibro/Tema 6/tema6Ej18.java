/*
 * tema6Ej18.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Hacer un programa que repita 1000 veces lo sigueinte: elegir aleatoriamente 3 números entre el 1 y el 6 sin que se repitan, y contabilizarlos.

Al final, el programa debe decirnos cuántas veces ha salido el 1, el 2, ... y el 6.

Para elegir aleatoriamente 3 números, utilice una de las siguientes opciones:
OPCION A:
- Repetir la generación de 3 números aleatorios entre 1 y 6 mientras haya coincidencias.
OPCION B:
- Generar un número aleatorio entre 1 y 6
- Repetir la generación un segundo número 
aleatorio entre 1 y 6 mientras se repita con el primero
- Repetir la generación de un terecer número aleatorio entre 1 y 6 mientras se repita con el primero o con el segundo.
 */


public class tema6Ej18 {
	
	public static void main (String args[]) {

   int n;
   int n1;
   int n3;
   for(int i =0;i<1000;i++){
    do{
      
    n=(int)(Math.random()*6+1);
    n1=(int)(Math.random()*6+1);
    n3=(int)(Math.random()*6+1);
      }while(n==n1||n==n3||n1==n3);
    System.out.println(n + " "+n1 + " " + n3);
    
  }
    
    
    
	}
}

