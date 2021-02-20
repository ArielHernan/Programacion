/*
 * Tema8Ej41.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 41
Realiza un programa que pinte un triángulo relleno tal como se muestra en
los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
ya se realizó en el tema de bucles, ahora se trata de usar una función para
que la implementación sea más sencilla. Por ejemplo, se puede crear una
función linea(char caracter, int repeticiones) que pinte una línea con el carácter
especificado
 * 
 */

import java.util.Scanner;
public class Tema8Ej41 {
	
	public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("Este programa pinta piramides:");
    System.out.println();
    System.out.println("introduce la altura");
    int altura=s.nextInt();
    System.out.println("introduce el caracter");
    char simbolo=s.next().charAt(0);
    
    for(int i=altura;i>0;i--){
      System.out.println(linea(simbolo,i));
    }
	}



  public static String linea(char caracter,int repeticiones){
    
    String resultado="";
    
    for(int i=0;i<repeticiones;i++){
      resultado=resultado+caracter;
    }
    return resultado;
    
  }
}

