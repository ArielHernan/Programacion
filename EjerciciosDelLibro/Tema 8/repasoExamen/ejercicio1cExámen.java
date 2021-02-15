/*
 * ejercicio1cExámen.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 

 */


public class ejercicio1cExámen {
	
	public static void main (String args[]) {
		
   /* System.out.println("Indique el número de filas: ");
    int fila = Integer.parseInt(System.console().readLine());
    
    System.out.println("Indique el número de columnas: ");
    int columna = Integer.parseInt(System.console().readLine());
    
    System.out.println("Indique el número de filas central: ");
    int filCent = Integer.parseInt(System.console().readLine());
    
    System.out.println("Indique el número de columna central: ");
    int colCent = Integer.parseInt(System.console().readLine());*/
    int dim=7;
    int capas = dim/2+1;
    int [][] matriz = new int[dim][dim];

    for (int k=0; k<capas; k++) {
      for (int i=k; i<dim-k; i++) {
        for (int j=k; j<dim-k; j++) {
          matriz [i][j] = capas-k;
        }
      }
    }
    
      for (int i=0; i<dim; i++) {
        for (int j=0; j<dim; j++) {
          System.out.printf("%3d",matriz[i][j]);
        }
      System.out.println();
    }
    
  }  
}
    



