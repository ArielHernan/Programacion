/*
 * tema6Ej12.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 12
    Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
    con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
    convertir un entero en un carácter.
 */


public class tema6Ej12 {
	
	public static void main (String args[]) 
        throws InterruptedException {
    
    System.out.print("\033[32m"); // pinta en verde
    
    for(int i=0;i<8000;i++){
      for(int j=0;j<79;j++){
        char n=((char)(Math.random()*(127-32)+32));
        System.out.print(n);
        }
        Thread.sleep(500);
        System.out.println();
      }

		
	}
}

