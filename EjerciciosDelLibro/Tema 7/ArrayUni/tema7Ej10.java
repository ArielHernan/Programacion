/*
 * tema7Ej10.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 10
    Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
    y que los almacene en un array. El programa debe ser capaz de pasar todos
    los números pares a las primeras posiciones del array (del 0 en adelante) y
    todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
    necesario.
 */


public class tema7Ej10 {
	
	public static void main (String args[]) {
		
    int n[]=new int[20];
    int imp[]=new int[20];
    int par[]=new int[20];
    int contimpar=0;
    int contpar=0;
    
    for(int i=0;i<20;i++){
      n[i]=(int)(Math.random()*101);
      System.out.print(n[i]+" ");
      if(n[i]%2==0){
        par[contpar]=n[i];
        contpar++;
        }else{
          imp[contimpar]=n[i];
          contimpar++;
          }
    }
    System.out.println();
      
    for(int i=0;i<contpar;i++){
      System.out.print(par[i]+" ");
      }
    for(int i=0;i<contimpar;i++){
      System.out.print(imp[i]+" ");
      }
	}
}

