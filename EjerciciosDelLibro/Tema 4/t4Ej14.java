/*
 * t4Ej14.java
 * 
 *  Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
  14. Realiza un programa que diga si un número introducido por teclado
* es par y/o divisible entre 5
 */
import java.util.Scanner;
public class t4Ej14 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n=0;
    System.out.println("Este programa dice si un número introducido por teclado\nes par y/o divisible entre 5.");
    System.out.println("Introduce tu número: ");
    
    n=s.nextInt();
    
    if((n % 2 )==0){
      
      System.out.println("El número es par.");
      }else{
      System.out.println("El número  es impar.");
        }
    if((n % 5)==0){
      System.out.println("Y el número es divisible entre 5.");
      }else{
      System.out.println("Y el número no es divisible por 5.");

        }
    
		
	}
}

