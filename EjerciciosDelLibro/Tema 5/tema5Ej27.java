/*
 * tema5Ej27.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejercicio 27
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
 */


public class tema5Ej27 {
	
	public static void main (String args[]) {
    
    System.out.println("introduce un numerio");
    int n=Integer.parseInt(System.console().readLine());
    int suma=0;
    int contador=0;
    System.out.println("los multiplos son: ");
    for(int i=0;i<=n;i=i+3){
      System.out.print(i+ " ");
      suma=suma+i;
      contador++;
      }
      System.out.println();
      System.out.println("la suma es: " + suma + "\ny el número de múltiplos son: "+ contador);
	}
}

