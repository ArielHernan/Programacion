/*
 * t4Ej17.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 * 17. Escribe un programa que diga cuál es la última cifra de un número
 * entero introducido por teclado.
 */
public class t4Ej17 {
	
	public static void main (String args[]) {
    
    System.out.println("Este programa te dice cual es el último dígito de un número metido");
    System.out.println("Introduce el número:");
    int n= Integer.parseInt(System.console().readLine());
    
    System.out.println("La última cifra del número iuntroducido es: " + (n%10));

    
    

		
	}
}

