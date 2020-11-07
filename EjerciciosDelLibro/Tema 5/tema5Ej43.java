/*
 * tema5Ej43.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 43
    Escribe un programa que permita partir un número introducido por teclado en
    dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
    el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
    el número introducido tiene dos dígitos como mínimo y la posición en la que
    se parte el número está entre 2 y la longitud del número. No se permite en
    este ejercicio el uso de funciones de manejo de String (por ej. para extraer
    subcadenas dentro de una cadena).
  
 */


public class tema5Ej43 {
	
	public static void main (String args[]) {
		
    System.out.println("introduce un número");
    int n= Integer.parseInt(System.console().readLine());
    
    System.out.println("introduce n que posicion partirlo");
    int posicion= Integer.parseInt(System.console().readLine());
    
    int aux=n;
    int longitud=0;
    int iz;
    int der;
    
    while(aux>0){
      longitud++;
      aux/=10;
      }
    int puntodeCorte=(longitud-(posicion-1))*10;
    System.out.println(puntodeCorte);
    
    System.out.print((n/puntodeCorte));
    System.out.print(n%puntodeCorte);
    
	}
}

