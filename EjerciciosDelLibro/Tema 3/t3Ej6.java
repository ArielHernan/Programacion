/*
 * t3Ej6.java
 * 
    Ejercicio 6
    Escribe un programa que calcule el área de un triángulo.
 * 
 */
import java.util.Scanner;
public class t3Ej6 {
	
	public static void main (String args[]) {
		
    Scanner s=new Scanner(System.in);
    
    double h=0;
    double b=0;
    double a=0;
    
    System.out.println("\tCalculamos el área de un triángulo: ");
    
    System.out.println("\tintroduce la altura en cms: ");
    h=s.nextDouble();
    
    System.out.println("\tintroduce la base en cms: ");
    b=s.nextDouble();
    
    a=(b*h)/2;
    
    System.out.println("\tEl área de este triángulo es: " + a);
    
    

    
    
	}
}

