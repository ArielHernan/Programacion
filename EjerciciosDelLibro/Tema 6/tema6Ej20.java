/*
 * tema6Ej20.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 20
    Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
    agua. La capacidad será indicada por el usuario. La cuba se llenará con una
    cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
    pueda admitir. El ancho de la cuba no varía.
    Ejemplo:
    Por favor, indique la capacidad de la cuba en litros: 3
    *    *
    *====*
    *====*
    ******
    La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.

 */


public class tema6Ej20 {
	
	public static void main (String args[]) {
    
    System.out.print("indica la capacidad de agua en litros: ");
    int capacidad= Integer.parseInt(System.console().readLine());
    int agua = (int)(Math.random()*capacidad+1);
    int huecovacio=capacidad-agua;
    int huecolleno=agua;
        System.out.println();
    
    for(int j=0;j<huecovacio;j++){
      System.out.print("*");
      for(int k=0;k<(capacidad*2)-2;k++){
        System.out.print(" ");
        }
      System.out.print("*");
      System.out.println();
      }
    
    for(int j=0;j<huecolleno;j++){
      System.out.print("*");
      for(int k=0;k<(capacidad*2)-2;k++){
        System.out.print("=");
        }
      System.out.print("*");
      System.out.println();
      }
    for(int i=0;i<capacidad*2;i++){
      System.out.print("*");
      }
	}
}

