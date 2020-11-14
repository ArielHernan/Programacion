/*
 * tema6Ej24.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 24
    Escribe un programa que, dado un número introducido por teclado, elija al azar
    uno de sus dígitos.
    Ejemplo 1:
    Por favor, introduzca un número entero positivo: 406783
    7
    Ejemplo 2:
    Por favor, introduzca un número entero positivo: 406783
    3
    Ejemplo 3:
    Por favor, introduzca un número entero positivo: 406783
    0

 */


public class tema6Ej24 {
	
	public static void main (String args[]) {
    
    System.out.print("Por favor, introduzca un número entero positivo:");
    
		int n=Integer.parseInt(System.console().readLine());
    int aux=n;
    int contador=0;
    int factor=1;
    
    while(aux>0){
    contador++;  
    aux/=10;
      }
      
    int posicion=(int)(Math.random()*contador)+1;
    System.out.println(posicion+" esta es la posicion");
    posicion=contador-posicion; 

    for(int i=1;i<=posicion;i++){
      factor*=10;
      }
    System.out.println((n/factor)%10+" este es el número extraido de la posicion elegida");
	}
}

