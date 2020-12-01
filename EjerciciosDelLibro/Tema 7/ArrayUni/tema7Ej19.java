/*
 * tema7Ej19.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
      Ejercicio 19
      Realiza un programa que sea capaz de insertar un número en una posición
      concreta de un array. En primer lugar, el programa generará un array de 12
      números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
      debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
      el programa preguntará por el número que se quiere insertar y por la posición
      donde será insertado. Los números del array se desplazan a la derecha para
      dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
      siempre se perderá.
 */


public class tema7Ej19 {
	
	public static void main (String args[]) {
		
    int[]array=new int[12];
    int[]arrayResultado=new int[12];
    int numeroInsertar=0;
    int posicion=0;
    
    for(int i=0;i<12;i++){
      array[i]=(int)(Math.random()*201);
      }
    
    for(int i=0;i<12;i++){
      System.out.printf("%4d",i);
      }
    System.out.println();
    for(int i=0;i<12;i++){
      System.out.printf("%4d",array[i]);
      }
    System.out.println();
    System.out.println("dime que número quieres insertar");
    numeroInsertar=Integer.parseInt(System.console().readLine());
    
    System.out.println();
    
    System.out.println("dime en que posición insertar");
    posicion=Integer.parseInt(System.console().readLine());
    
    System.out.println();
  
  
    for(int i=11;i>posicion;i--){
      array[i]=array[i-1];
      }
      array[posicion]=numeroInsertar;
    
    for(int i=0;i<12;i++){
      System.out.printf("%4d",i);
      }
    System.out.println();
    for(int i=0;i<12;i++){
      System.out.printf("%4d",array[i]);
      }
    
	}
}

