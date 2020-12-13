/*
 * ejercico1Refuerzo.java
 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    1. Realice un programa que maneje un array de enteros cuyo tamaño se le indique al usuario,
    para almacenar tantos enteros como se hayan reservado. Muéstrelos en pantalla en orden
    inverso al que se han introducido. Sólo puede utilizar un array.
 */
public class ejercico1Refuerzo {
	
	public static void main (String args[]) {
    
    int array[]= new int[10];
		System.out.println("Introduzca 10 números zu hermano");
    
    for(int i=0;i<10;i++){
      System.out.print("Introduce el número " +(i+1)+" : ");
      array[i]=Integer.parseInt(System.console().readLine());
      }
    System.out.println();
    for(int i=9;i>=0;i--){
      System.out.print(array[i]+" ");
      }
	}
}

