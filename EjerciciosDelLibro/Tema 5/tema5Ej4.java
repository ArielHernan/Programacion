/*
 * tema5Ej4.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
* 4. Muestra los números del 320 al 160, contando de 20 en 20 hacia
* atrás utilizando un bucle for.
 * 
 */
 //    \033[44m Azul
    //    \033[49m Negro
    //    \033[41m rojo
    //    \033[47m blanco
    //    \033[40m negro
                           


public class tema5Ej4 {
	
	public static void main (String args[]) {
		
    for(double i=320.00;i>=160.00;i=i-20.00){
      
      System.out.printf("\033[41m%5.2f\033[49m  ",i);
      
      }
	}
}

