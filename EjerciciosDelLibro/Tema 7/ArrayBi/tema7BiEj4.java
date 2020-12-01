/*
 * tema7BiEj4.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 4
    Modifica el programa anterior de tal forma que las sumas parciales y la suma
    total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
    que el ordenador se queda “pensando” antes de mostrar los números.
 */


public class tema7BiEj4 {
	
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
          Thread.sleep(500);
          sumaFila=sumaFila+n[i][j];
          }
          sumaTotal=sumaTotal+sumaFila;
          Thread.sleep(1500);
          System.out.printf("%6d",sumaFila);
          Thread.sleep(1500);
          sumaFila=0;
          System.out.println();
      }
      
      for(int j=0;j<5;j++){
        for(int i=0;i<4;i++){
          sumaColumna=sumaColumna+n[i][j];
          }
          sumaTotal=sumaTotal+sumaColumna;
          System.out.printf("%6d",sumaColumna);
          Thread.sleep(1500);
          sumaColumna=0;
        }
      Thread.sleep(1500);
      System.out.printf("%6d",sumaTotal);
      
	}
}

