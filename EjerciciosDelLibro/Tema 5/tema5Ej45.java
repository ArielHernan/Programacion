/*
 * tema5Ej45.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 45
    Escribe un programa que cambie un dígito dentro de un número dando la
    posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
    empezando por el 1. Se recomienda usar long en lugar de int ya que el
    primero admite números más largos. Suponemos que el usuario introduce
    correctamente los datos.
    Ejemplo:
    Por favor, introduzca un número entero positivo: 406783
    Introduzca la posición dentro del número: 3
    Introduzca el nuevo dígito: 1
    El número resultante es 401783

 */


public class tema5Ej45 {
	
	public static void main (String args[]) {
		System.out.println("cambia un dígito dentro de un número dando la posición y el valor nuevo");
    System.out.println();
    
    System.out.print("Por favor, introduzca un número entero positivo:");
    long n=Long.parseLong(System.console().readLine());
    
    System.out.print("Por favor, introduzca la posicion:");
    int posicion=Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el nuevo dígito:");
    int digito=Integer.parseInt(System.console().readLine());
    
    long aux= n;
    long aux2;
    long girado=0;
    int fac=1;
    long girado2;
    long numfinal=0;
    
    while(aux>0){
      girado=(girado*10)+(aux%10);
      aux/=10;
      }
    for(int i=0 ;i<posicion;i++){
      fac*=10;
      }
    
    long iz=(girado/(fac/10));
    long der=girado%fac;

    iz=((iz/10)*10)+digito;
    der=der%(fac/10);
    girado2=(iz*(fac/10))+der;
    
    while(girado2>0){
      numfinal=(numfinal*10)+(girado2%10);
      girado2/=10;
      }
    
    System.out.println(numfinal);

 
    
    
    
	}
}

