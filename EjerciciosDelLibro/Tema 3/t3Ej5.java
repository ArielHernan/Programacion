/*
 * t3Ej5.java
 * 
    Ejercicio 5
    Escribe un programa que calcule el área de un rectángulo.
 */
  import java.util.Scanner;
  public class t3Ej5 {
	
    public static void main (String args[]) {
      
      Scanner s=new Scanner(System.in);
      
      int h=0;
      int b=0;
      int al;
      
      System.out.println("\t Este programa calcula el área de un rectángulo:\n\t introduce la altura:");
      h=s.nextInt();
      System.out.println("\t introduce la base:");
      b=s.nextInt();
      
      al=h*b;
      System.out.println("\n\t Tu altura es: " + al);

	}
}

