/*
 * tema5Ej10.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 10
    Escribe un programa que calcule la media de un conjunto de números positivos
    introducidos por teclado. A priori, el programa no sabe cuántos números se
    introducirán. El usuario indicará que ha terminado de introducir los datos
    cuando meta un número negativo.
 */
import java.util.Scanner;
public class tema5Ej10 {

	public static void main (String args[]) {
		  Scanner s=new Scanner(System.in);
      int n=0;
      int suma=0;
      int cont=0;
      
      System.out.println("Introduce los números que quieras y te daré su suma y su media");
      
      while(n>=0){
          
          n=s.nextInt();
          suma=suma+n;
          cont++;
        }
    System.out.println("has introducido " + (cont-1) + " numeros y su media es " + ((suma-n)/(cont-1)));
	}
}

