/*
 * ejClaseTabla.java
    Escribe un programa que pida al usuario un número entero.
    Si el número es par, debe presentar su tabla de multiplicar (del 1 al 10).
    Si el número es impar, debe presentar su tabla de sumar (1 al 10).
    Escribe un programa que pida al usuario un número entero.
    Si el número es par, debe presentar su tabla de multiplicar (del 1 al 10).
    Si el número es impar, debe presentar su tabla de sumar (1 al 10).

 * 
 */

import java.util.Scanner;
public class ejClaseTabla {
	
	public static void main (String args[]) {
		Scanner s= new Scanner(System.in);
    
    int n =0;
    int mul=1;
    int sum=0;
    
    System.out.println("Este programa hace la tabla de multiplicar o la de sumar\ndependiendo si es par o impar");
    System.out.println("Introduce un número:");
    n=s.nextInt();
    
    if(n%2==0){
       for(int i=0;i<=10;i++){
        System.out.println("el número " + n + " multiplicado por " + i + " es "+ i*n);
        }
      
      }else{
        
        for(int i=0;i<=10;i++){
        System.out.println("el número " + n + " sumado a " + i + " es "+ (i+n));
        }
	}
}

}
