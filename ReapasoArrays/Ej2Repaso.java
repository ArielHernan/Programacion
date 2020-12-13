/*
 * Ej2Repaso.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
  
    Ejercicio 2
    Escribe un programa que pida 20 números enteros. Estos números se deben
    introducir en un array de 4 filas por 5 columnas. El programa mostrará las
    sumas parciales de filas y columnas igual que si de una hoja de cálculo se
    tratara. La suma total debe aparecer en la esquina inferior derecha.
 */


public class Ej2Repaso {
	
	public static void main (String args[]) {
		
    int[][] array=new int[4][5];
    int sumaFilas=0;
    int sumaColumnas=0;
    int total=0;
    
    System.out.println("Introduce 20 números");
    
    System.out.println();
    
    for( int i=0;i<4;i++){
      for(int j=0;j<5;j++){
      System.out.print("fila "+i+" columna "+j+" : ");
      array[i][j]=Integer.parseInt(System.console().readLine());
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

