/*
 * Tema8Ej42.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * Ejercicio 42
    Realiza un programa que pinte un triángulo hueco tal como se muestra en los
    ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
    pintar las líneas.
     * 
 */

import java.util.Scanner;
public class Tema8Ej42 {
	
	public static void main (String args[]) {
		
    Scanner s=new Scanner(System.in);
    System.out.println("Este programa pinta piramides:");
    System.out.println();
    System.out.println("introduce la altura");
    int altura=s.nextInt();
    System.out.println("introduce el caracter");
    char simbolo=s.next().charAt(0);
    System.out.println();
    
    System.out.println(linea(simbolo,altura));
    
    for(int i=1;i<altura;i++){
      System.out.print(simbolo+linea(' ',altura-2-i));
        if(i<altura-1){
          System.out.print(simbolo);
        }
        System.out.println();
    }
        

  }
    
    
      
  public static String linea(char caracter, int repeticiones) {

      String resultado = "";

      for (int i = 0; i < repeticiones; i++) {
        resultado += caracter;
      }

      return resultado;
    }
  

	
}

