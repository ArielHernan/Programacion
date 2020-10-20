/*
 * tema5Ej6.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
6. Muestra los números del 320 al 160, contando de 20 en 20
* utilizando un bucle do-while.
 * 
 * 
 */


public class tema5Ej6 {
	
	public static void main (String args[]) {
		
    int i = 320;
    
    do{
      
      System.out.printf("\033[41m%30d%50s\n",i," ");
      System.out.print("\033[40m");
      i=i-20;
      
      }while(i>=160);
	}
}

