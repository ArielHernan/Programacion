/*
 * tema7Ej17.java
 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 
    Ejercicio 17
    Escribe un programa que muestre por pantalla un array de 10 números enteros
    generados al azar entre 0 y 100. A continuación, el programa debe pedir un
    número al usuario. Se debe comprobar que el número introducido por teclado
    se encuentra dentro del array, en caso contrario se mostrará un mensaje por
    pantalla y se volverá a pedir un número; así hasta que el usuario introduzca 
    uno correctamente. A continuación, el programa rotará el array hacia la 
    derecha las veces que haga falta hasta que el número introducido quede 
    situado en la posición 0 del array. Por último, se mostrará el array 
    rotado por pantalla.
 */
public class tema7Ej17 {
	
	public static void main (String args[]) {
    
    int[] array1=new int[10];
    for(int i=0;i<9;i++){
      array1[i]=(int)(Math.random()*101);
      System.out.print( array1[i]+" ");
      }
    
	}
}

