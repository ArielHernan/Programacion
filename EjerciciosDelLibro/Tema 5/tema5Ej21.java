/*
 * tema5Ej21.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejercicio 21
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */


public class tema5Ej21 {
	
	public static void main (String args[]) {
    
    int n=0;
    int contador=0;
    int suma=0;
    int mediaImpares=0;
    int mayorPares=0;
    int contadorImpares=0;

    
    
      do{
        System.out.println("Introdce un número");
        n=Integer.parseInt(System.console().readLine());
        
        if(n%2==0&&n>mayorPares){
          mayorPares=n;
          }
          if(n%2!=0&&n>=0){
            contadorImpares++;
            suma=suma+n;
            mediaImpares=suma/contadorImpares;
            }

        contador++;
        }while(n>=0);
    System.out.println("Hemos introducido: "+ (contador-1)+" números"+" la media de los impares es: " + mediaImpares+ " El mayor de  los pares. " +mayorPares);
		
	}
}

