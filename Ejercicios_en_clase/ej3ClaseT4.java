/*
 * ej3ClaseT4.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 * Programa que escriba por pantalla la tabla de multiplicar de un número introducido por teclado.
 * También se ha de pedir por teclado la cantidad de filas que ha de tener la tabla de multiplicar. 
 * La tabla de multiplicar empezará por multiplicar el primer número introducido por 1, después lo hará por 2, y así hasta llegar al segundo número.

 */
import java.util.Scanner;
public class ej3ClaseT4 {
	
	public static void main (String args[]) {
    
    int n =0;
    int f=0;
    Scanner s= new Scanner(System.in);
    System.out.println("mete el numero de la tabla:");
    n=s.nextInt();
    System.out.println("mete el numero de filas:");
    f=s.nextInt();
     for(int i =1;i<=f;i++){
       
       System.out.println(n*i);
       
       }

		
	}
}

