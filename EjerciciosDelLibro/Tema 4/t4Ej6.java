/*
 * t4Ej6.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 * 6. Realiza un programa que calcule el tiempo que tardará en caer un
 * objeto desde una altura h.
 * t = raiz(2h/g) siendo g = 9.81 m/s2
 * 
 * 
 */

import java.util.Scanner;
public class t4Ej6 {

final static double g=9.81;
	public static void main (String args[]) {
    
    Scanner s=new Scanner(System.in);
    
    System.out.println("Este programa calcula el tiempo que tarda en caer un objeto:");
    System.out.println("Introduce la altura en metros:");
    
    Double h=s.nextDouble();
    double t= Math.sqrt(2*h/g);
    
    System.out.printf("El tiempo que tarda en caer es: %.2f",t);
    System.out.print(" segundos");


    
    
    

    
		
    
	}
}

