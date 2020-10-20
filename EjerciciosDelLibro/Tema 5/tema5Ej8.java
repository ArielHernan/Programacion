/*
 * tema5Ej8.java
 * 
 * Ejercicio 8
    Muestra la tabla de multiplicar de un número introducido por teclado
 */
import java.util.Scanner;
public class tema5Ej8 {
	
	public static void main (String args[]) {
		Scanner s=new Scanner(System.in);
    int n =0;
    System.out.println("Este programa imprime la tabla de multiplicar");
    System.out.println("Introduce el número para hacerle la tabla:");
    n=s.nextInt();
    System.out.println("");


    for(int i=1;i<10;i++){
      
      System.out.println(i + " * " + n + " = " + (i*n));
      
      }
	}
}

