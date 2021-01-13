/*
 * sorpresaArray.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 
 */


public class sorpresaArray {
	
	public static void main (String args[]) {
    
    int x=0;
    int y=0;
    int n=0;
    int n2=0;
    int aux=0;
    int[][] array;
    
    System.out.println("escribe el rango de números con el que rellenar el array, escribe el valor mínimo: ");
    n=Integer.parseInt(System.console().readLine());
    
    System.out.println("escribe el rango de números con el que rellenar el array, escribe el valor máximo: ");
    n2=Integer.parseInt(System.console().readLine());
		
    
    System.out.println("escribe el número de filas:  ");
    x=Integer.parseInt(System.console().readLine());
    
    
    y= 2*x;
    array =new int[x][y];
    boolean esPrimo=true;
    
    for(int i=0;i<x;i++){
      for(int j=0;j<y;j++){
      array[i][j]=(int)(Math.random()*n2-n+1)+n;
      }
      System.out.println();
      }
      
    for(int i=0;i<x;i++){
      for(int j=0;j<x*2;j++){
      System.out.printf("%3d",array[i][j]);
      }
      System.out.println();
      }
      
    for(int i=0;i<x;i++){
      for(int j=2*i;j<=2*i+1;j++){
        esPrimo=true;
         aux=array[i][j];
        for(int k=2;k<aux;k++){
          if(aux%k==0){
            esPrimo=false;
          }
        
        }
      if(esPrimo){
          System.out.print(" " + aux);
      }
      }
      System.out.println();
       
    }
    
    
    }
  }
    
    
	


