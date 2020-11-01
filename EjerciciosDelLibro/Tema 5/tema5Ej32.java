/*
 * tema5Ej32.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 32
Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
 */


public class tema5Ej32 {
	
	public static void main (String args[]) {
    
    System.out.println("Introduce un número ");
    int n=Integer.parseInt(System.console().readLine());
    int suma=0;
    int girado=0;
    int contador=0;
    
    while(n>0){
      girado=(girado*10)+(n%10);
      n/=10;
      contador++;
      }
      System.out.println(girado);
      

    
	}
}

