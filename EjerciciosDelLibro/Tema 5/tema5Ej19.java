/*
 * tema5Ej19.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 19
Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 * 
 */


public class tema5Ej19 {
	
	public static void main (String args[]) {
    
		System.out.println("Este programa pinta pirámides");
    
    System.out.println("Introduce la atura:");
    int altura=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el simbolo:");
    String simbolo=System.console().readLine();
    
    int contador=1;
    int espacio=(2*(altura-1))+10;
    int pintacaracter=1;
    
    while(contador<altura){
      
      for (int i=0;i<espacio;i++){
        
        System.out.print(" ");
        }
        
      for (int i =0;i<pintacaracter;i++){
        
        System.out.print(simbolo);
        }
      System.out.println();
      espacio--;
      pintacaracter+=2;
      altura--;
      }
    

	}
}

