/*
 * ej2ClaseT4.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 */
import java.util.Scanner;
public class ej2ClaseT4 {
	
	public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    int n1=0;
    int n2=0;
    
    for (int i =0; i<10;i++){
    System.out.println("Este Programa realiza diez sumas independientes de 2 números cada una, los cuales se pedirán, en cada ocasión,al usuario.\nEn cada pasada, se han de pedir los dos números a sumar y mostrar el resultado de la suma.");
   
    System.out.println("introduce el primer número");
    n1=s.nextInt();
    
    System.out.println("introduce el segundo número");
    n2=s.nextInt();
    
    
    System.out.println("El resultado de la suma es:");
    
    System.out.println("suma = " + (n1+n2) );
    
    System.out.println("pon el siguiente numero");

   }
     
     
	}
}

