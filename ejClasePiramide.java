/*
 * ejClasePiramide.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
     * 
    A partir de un número introducido por teclado (ej:5)
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5



    A partir de un número introducido por teclado (ej:5)
    1
    1 2 3
    1 2 3 4 5
    1 2 3 4 5 6 7
    1 2 3 4 5 6 7 8 9
 */

import java.util.Scanner;
public class ejClasePiramide {

	public static void main (String args[]) {
    
      Scanner s= new Scanner(System.in);
      int a=0;

    System.out.println("Este programa pinta medias pirámides con números correlativos");
    System.out.println("introduce la altura:");
    
    a=s.nextInt();
      System.out.println("");  System.out.println("");
    
    for(int i=1;i<=a;i++){
      for(int j=1;j<=i;j++){
      System.out.print(" "+(j));
       }
       System.out.println("");
      }
	}
}

