/*
 * tema5Ej33.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejercicio 33
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.

 */


public class tema5Ej33 {
	
	public static void main (String args[]) {
    
    System.out.println("Pintamos una U,itroduce la altura");
    
    int n=Integer.parseInt(System.console().readLine());
    int nu=n+10;
    
    System.out.println();
    System.out.println();
    
    for(int i=1;i<n;i++){
      for(int z=0;z<20;z++){
        System.out.print(" ");
        }
      System.out.print("*");
     
      for(int j=0;j<((n/2)+1);j++){
        System.out.print(" ");
        }
      System.out.print("*");
      System.out.println();
      }
   for(int z=0;z<20;z++){
        System.out.print(" ");
        }   
   System.out.print(" ");
   for(int i=0;i<((n/2)+1);i++){
   System.out.print("*");
    }
    
		
	}
}

