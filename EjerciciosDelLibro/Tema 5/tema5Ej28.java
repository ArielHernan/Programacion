/*
 * tema5Ej28.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejercicio 28
Escribe un programa que calcule el factorial de un número entero leído por
teclado.
Ejemplo:

 * 
 */


public class tema5Ej28 {
	
	public static void main (String args[]) {
		
    System.out.println("numero introduce");
    int n=Integer.parseInt(System.console().readLine());
    int fact=1;
    for(int i=1;i<=n;i++){
      fact*=i;
      }
    System.out.println(fact);
	}
}

