/*
 * repasoEj3Bi.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 3
    Modifica el programa anterior de tal forma que los números que se introducen
    en el array se generen de forma aleatoria (valores entre 100 y 999).

 */


public class repasoEj3Bi {
	
	public static void main (String args[]) {
		
       int[][] array=new int[4][5];
    int sumaFilas=0;
    int sumaColumnas=0;
    int total=0;
  
    
    for( int i=0;i<4;i++){
      for(int j=0;j<5;j++){
      System.out.print("fila "+i+" columna "+j+" : ");
      array[i][j]=(int)(Math.random()*800)+100;
      System.out.print(array[i][j]);
      System.out.println();
      }
      
    }
    
    System.out.println();
    
    for(int i=0;i<4;i++){
      for(int j=0;j<5;j++){
        System.out.printf("%4d",array[i][j]);
        sumaFilas=sumaFilas+array[i][j];
        
        }
        total=total+sumaFilas;
        System.out.printf("%5d",sumaFilas);
        sumaFilas=0;
        System.out.println();
      }
     System.out.print("   "); 
    for(int i=0;i<22;i++){
      System.out.print("-");
      }
      System.out.println();
      
      
    for(int j=0;j<5;j++){
      for(int i=0;i<4;i++){
        sumaColumnas=sumaColumnas+array[i][j];
        }
        System.out.printf("%4d",sumaColumnas);
        sumaColumnas=0;
      }
    System.out.printf("%5d",total);
	} 
} 
	
