  /*
 * t2ej4.java
 * 
 * Copyright 2020 Ariel Rojas <>
 * 
    Ejercicio 4
      Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
      convertir deberá estar almacenada en una variable.
*/

public class t2ej4 {
	
	public static void main (String args[]) {
    
     System.out.println("introduce la cantidad de euros a convertir:");  
      
    double euros= Double.parseDouble (System.console().readLine());
    int pesetas = (int)(euros*166.386);
    
    System.out.println("La cantidad de euros introducidos son: " + euros);  
    System.out.println("La cantidad de pesetas son: " +pesetas);

    

    
    
	}
}

