/*
 * ejercicio6.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 6
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array
 */


public class ejercicio6 {
	
	public static void main (String args[]) {
		
    int[] array= new int[15];
    int aux;
    
    System.out.println("Introduce 15 números");
    System.out.println();
    
    for(int i=0;i<15;i++){
      System.out.print("Introduce el numero en posición " + i+ " :");
      array [i]=Integer.parseInt(System.console().readLine()); 
      
      }
      
      System.out.println();
      
      System.out.println("El array original es:");
      System.out.println();
      System.out.print("posición  ");
      for(int i=0;i<15;i++){
        System.out.printf("%4d",i);
        }
        System.out.println();
      System.out.print("array     ");  
      for (int i=0;i<15;i++){
        System.out.printf("%4d",array[i]);
        }
      //rotamos el array
      
      aux=array[14];
      for (int i=14;i>0;i--){
        array[i]=array[i-1];
        }
      array[0]=aux;
      
      System.out.println("\n\nEl array rotado sale tal que así:");
      System.out.println();
 
      
      System.out.print("posición  ");
      for(int i=0;i<15;i++){
        System.out.printf("%4d",i);
        }
      System.out.println();
      System.out.print("array     ");  
      for (int i=0;i<15;i++){
        System.out.printf("%4d",array[i]);
        }
	}
}

