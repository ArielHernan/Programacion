/*
 * t4Ej11.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
  * 11. Escribe un programa que dada una hora determinada (horas y minutos),
  * calcule los segundos que faltan para llegar a la medianoche.
   * 
 */

import java.util.Scanner;
public class t4Ej11 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int h=0;
    int m=0;
    int f=0;
    int segpas=0;
    int segdia=(24*60*60);
    
    System.out.println("Este programa calcula los segundos que faltan para llegar a media noche\nsolo tienes que meter la hora que es.\nIntroduce la hora (formato 24), deja un espacio e introduce los minutos\n");
    
    h=s.nextInt();
    m=s.nextInt();
    segpas= ((h*60*60)+(m*60));
    
    System.out.println("\n\tEl día tiene " + segdia + " segundos");    
    System.out.println("\n\than pasado " + segpas + " segundos ");
    System.out.println("\n\tquedan " + (segdia-segpas) + " segundos para acabar el dïa");

    
	}
}

