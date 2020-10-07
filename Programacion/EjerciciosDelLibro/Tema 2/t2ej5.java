/*
 * Copyright 2020 Ariel Rojas <>
* 5. Realiza un conversor de pesetas a euros. La cantidad en pesetas
* que se quiere convertir deberá estar almacenada en una variable.
 */


public class t2ej5 {
	
	public static void main (String args[]) {
    
    System.out.println("Esto es u conversor de pesetas a euros\n");
    System.out.println("introduce la cantidad de pesetas a convertir:\n");
    
    int pesetas= Integer.parseInt(System.console().readLine());
    double euros= (double)(pesetas/166.386);
    
    System.out.println("La cantidad de pesetas introducidas son: " + pesetas);
    System.out.printf("La cantidad de euros son: %.2f", euros);
   
    
    
		
	}
}

