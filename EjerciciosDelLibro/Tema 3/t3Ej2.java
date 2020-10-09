import java.util.Scanner;
/*
 * t3Ej2.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 2
    Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
    convertir debe ser introducida por teclado.
     */


public class t3Ej2 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
		double euros = 0;
    int pesetas = 0;
    String frase= "Introduce la cantidad de euros que quieres cambiar:\n ";
    
    System.out.printf("%50s%55s", "Esto es un convertidor de euros a pesetas.\n",frase);
    
    euros = s.nextDouble();
    pesetas= (int)(euros * 166.386);
    
    System.out.printf("La cantidad en pesetas son : %20d", pesetas);
   
    
	}
}

