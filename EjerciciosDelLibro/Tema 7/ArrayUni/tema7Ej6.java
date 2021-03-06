/*
 * tema7Ej6.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 6
    Escribe un programa que lea 15 números por teclado y que los almacene en un
    array. Rota los elementos de ese array, es decir, el elemento de la posición 0
    debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
    la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
    del array.
 */


public class tema7Ej6 {
	
	public static void main (String args[]) {
		
    int[] n=new int[15];
    int aux;
    
    System.out.println("Introduce 15 números y despues pulsa enter");
        for(int i=0;i<15;i++){
          n[i]=Integer.parseInt(System.console().readLine());    
      }
       aux=n[14];
    System.out.println("\nEste es el array original: ");    
    System.out.print("posición: ");
    
    for(int i=1;i<=15;i++){
      System.out.printf("%4d",i);
      }
      
    System.out.println();
    
    System.out.print("numero:   ");
    
    for(int i=0;i<15;i++){
      System.out.printf("%4d",n[i]);
      }
    
    for(int i=14;i>0;i--){
      n[i]=n[i-1];
      }
      n[0]=aux;
   System.out.println();
    System.out.println("\nEste es el array volteado: ");
    System.out.print("posición: ");
    for(int i=1;i<=15;i++){
      System.out.printf("%4d",i);
      }
      
    System.out.println();
    
    System.out.print("numero:   ");
    
    for(int i=0;i<15;i++){
      System.out.printf("%4d",n[i]);
      }
	}
}

