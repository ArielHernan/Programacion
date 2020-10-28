/*
 * tema5Ej17.java
 * 
Ejercicio 17
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
 */

import java.util.Scanner;
public class tema5Ej17 {
	
	public static void main (String args[]) {
    
    Scanner s=new Scanner(System.in);
    System.out.println("sume los 100 números siguientes a un número entero\ny positivo introducido por teclado. Se debe comprobar que el dato introducidoes correcto (que es un número positivo). ");
		System.out.println();
    
    int n=-1;
    int suma=0;
    
    while(n<0){
      
      System.out.println("introduce un número");
      n=s.nextInt();
      if(n<0){
        System.out.println("el número introducido es incorrecto intentalo otra vez");
      }
    }

      for(int i=n;i<=(n+100);i++){
        
        suma=suma+i;
        
        }
    System.out.println("introduce un número");

    System.out.println("La suma de " + n + " y sus cien números siguientes es: " + suma);      
      
	}
}

