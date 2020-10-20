/*
 * tema5Ej1.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
      Ejercicio 1
      Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
      * * 
 */
public class tema5Ej1 {
	
	public static void main (String args[]) {
    
    System.out.println("Este Programa muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for");
    
    for(int i=1;i<=100;i++){
      
      if(i%5==0){
        
        System.out.println("el número " + i + (" es múltiplo de 5"));
        }
      }
		
	}
}

