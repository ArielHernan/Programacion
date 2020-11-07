/*
 * tema5Ej53.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 53
Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
Ejemplo 1:
Introduzca la altura de la figura: 8
********
*******
******
*****
****
***
**
*
Ejemplo 2:
Introduzca la altura de la figura: 5
*****
****
***
**
*
 * 
 */


public class tema5Ej53 {
	
	public static void main (String args[]) {
		System.out.println("intoriduce la altura:");
    int n=Integer.parseInt(System.console().readLine());
    
    for(int i=n;i>0;i--){
      for(int j=0;j<i;j++){
      System.out.print("*");
        }
    System.out.println();
      }
	}
}

