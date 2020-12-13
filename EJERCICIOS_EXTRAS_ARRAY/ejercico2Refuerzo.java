/*
 * ejercico2Refuerzo.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
     2. Modifique el programa anterior para invertir el orden de los elementos en el array, y
    presente los elementos tanto en el orden original en el que se introdujeron como en el orden
    inverso al que se introdujeron. Puede utilizar todos los arrays que desee.

 */


public class ejercico2Refuerzo {
	
	public static void main (String args[]) {
		
    int array[]= new int[10];
		System.out.println("Introduzca 10 números zu hermano");
    
    for(int i=0;i<10;i++){
      System.out.print("Introduce el número " +(i+1)+" : ");
      array[i]=Integer.parseInt(System.console().readLine());
      }
    System.out.println();
    System.out.println("Este es el array en orden inverso");
    for(int i=9;i>=0;i--){
      System.out.print(array[i]+" ");
      }
    System.out.println();
    System.out.println("Este es el array en orden introducido");
    for(int i=0;i<10;i++){
      System.out.print(array[i]+" ");
      }
    
	}
}
