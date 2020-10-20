/*
 * ejlibre.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
   termina cuando se introduce por teclado un
 * número impar.
 * 
 */
 
import java.util.Scanner;
public class ejlibre {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n=0;
    
   
    
    while(n%2==0){
      
      System.out.println("introduce un número se termina al introducir un impar");
      n=s.nextInt();
      if(n%2==0){
        System.out.println("este número es par seguimos el programa");
      }else{
        System.out.println("Al no ser par se sale del pograma");
        }
      }
    
    
		
	}
}

