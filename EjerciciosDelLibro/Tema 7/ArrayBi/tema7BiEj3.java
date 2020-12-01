/*
 * tema7BiEj3.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 3
    Modifica el programa anterior de tal forma que los números que se introducen
    en el array se generen de forma aleatoria (valores entre 100 y 999).

 */


public class tema7BiEj3 {
	
	public static void main (String args[]) 
		throws InterruptedException { 
      
      int[][] n=new int[4][5];
      int sumaFila=0;
      int sumaColumna=0;
      int sumaTotal=0;
      
      for(int i=0;i<4;i++){
        for(int j=0;j<5;j++){
          n[i][j]=((int)(Math.random()*900))+100;
          
          }
        }
      System.out.println("Este es el array que se ha dibujado:\n");
      
      for(int i=0;i<4;i++){
        for(int j=0;j<5;j++){
          System.out.printf("%6d",n[i][j]);
          if(n[i][j]==100){
            System.out.printf("%6d**",n[i][j]);
            }else{
            System.out.printf("%6d",n[i][j]); 
              }
          }
          System.out.println();
        }
      System.out.println();
      
      System.out.println("Ahora el array con las filas y columnas sumadas y la suma total:");
      
      System.out.println();
     
      for(int i=0;i<4;i++){
        for(int j=0;j<5;j++){
          System.out.printf("%6d",n[i][j]);
          sumaFila=sumaFila+n[i][j];
          }
          sumaTotal=sumaTotal+sumaFila;
          System.out.printf("%6d",sumaFila);
          sumaFila=0;
          System.out.println();
      }
      
      for(int j=0;j<5;j++){
        for(int i=0;i<4;i++){
          sumaColumna=sumaColumna+n[i][j];
          }
          sumaTotal=sumaTotal+sumaColumna;
          System.out.printf("%6d",sumaColumna);
          sumaColumna=0;
        }
      System.out.printf("%6d",sumaTotal);
	}
}
