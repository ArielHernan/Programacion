/*
 * t4Ej7.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    7. Realiza un programa que calcule la media de tres notas.

 */
import java.util.Scanner;
public class t4Ej7 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
      
      Double n1;
      Double n2;
      Double n3;
      Double m;
      
      System.out.println("Este programa calcula la media de tres notas: ");
      System.out.println("Introduce las tre notas separadas por un espacio");
      
      n1=s.nextDouble();
      n2=s.nextDouble();
      n3=s.nextDouble();
      
      m=((n1+n2+n3)/3);
      System.out.printf("La media es: %.1f",m);
      
      
      
      

      
      
		
	}
}

