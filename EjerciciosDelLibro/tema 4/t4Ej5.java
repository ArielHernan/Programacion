/*
 * t4Ej5.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
* 5. Realiza un programa que resuelva una ecuación de primer grado
* (del tipo ax + b = 0).
 */
import java.util.Scanner;
public class t4Ej5 {
	
	public static void main (String args[]) {
		
    Scanner s=new Scanner(System.in);
    
     int a=0;
     int b=0;
     int r=0;
    
     System.out.println("Este programa resuelve una ecuación de segundo grado");
     System.out.println("Introduce el valor de la a");
     a= s.nextInt();
     System.out.println("Introduce el valor de la b");
     b=s.nextInt();
    
      if(a==0){
     System.out.println("Esta ecuación no tiene solución");

      }
      else{
     r=-b/a;
     
     System.out.println("El resultado de la ecuación es: ");
     System.out.println(r);
    }
	}
}

