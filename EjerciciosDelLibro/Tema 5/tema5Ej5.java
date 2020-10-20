/*
 * tema5Ej5.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
  * 5. Muestra los números del 320 al 160, contando de 20 en 20 hacia
  * atrás utilizando un bucle while.
   * 
 */


public class tema5Ej5 {
	
	public static void main (String args[]) {
    
    int i=320;
    
    while(i>=160){
      
      System.out.printf("\033[41m%30d%50s\n",i," ");
      System.out.print("\033[40m");
      i=i-20;
      }
		
	}
}

