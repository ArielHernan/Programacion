import java.util.Scanner;
/*
 * t3Ej3.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
      Ejercicio 3
      Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
      convertir debe ser introducida por teclado.
 */
public class t3Ej3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner (System.in);
    
    int pesetas = 0;
    double euros = 0;
    
    System.out.printf("\n\n\n%50s\n%55s\n","Esto es un convertidor de pesetas a euros","Introduce la cantidad de pesetas a convertir: ");
    pesetas = s.nextInt();
    euros = (double)(pesetas/166.386);
    
    System.out.printf("\n%37s\n%17.2f","La cantidad de euros  son : ",euros);
		
	}
}

