/*
 * cortosBucles9.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    9.Realice un programa que capture números enteros por teclado, y que presente su cuadrado por pantalla.
    Debe hacer esto de manera repetitiva, hasta que el usuario introduzca un cero o hasta que el usuario haya
    introducido 4 números.
 */
import java.util.Scanner;
public class cortosBucles9 {
	
	public static void main (String args[]) {
		Scanner s=new Scanner(System.in);
    
    System.out.println("Este programa pide números enteros y devuelve su cuadrado ");
    System.out.println("De manera repetitiva hasta introducir un cero o introducido 4 números");
    
    int n =0;
    int contador=0;
    
   do{
     System.out.println("Introduce un número:");
     n=s.nextInt();
     System.out.println(n*n);
     contador++;

     
     }while(n!=0&&contador<4);


      
    
	}
}

