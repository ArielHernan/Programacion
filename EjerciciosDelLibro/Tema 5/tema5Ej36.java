/*
 * tema5Ej36.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 36
    Escribe un programa que diga si un número introducido por teclado es o no
    capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
    programa debe aceptar números de cualquier longitud siempre que lo permita
    el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
    long en lugar de int ya que el primero admite números más largos.
    * 
 */


public class tema5Ej36 {
	
	public static void main (String args[]) {
		System.out.println("Este programa te dice si un número es capicúa");
    
    long n=Long.parseLong(System.console().readLine());
    long girado=0;
    long ndecapar=n;
    while(ndecapar>0){
      girado=(girado*10)+(n%10);
      ndecapar/=10;
      }
      
      
    if(girado==n){
      System.out.println("El " + n+ " es capicúa");
      }else{
        System.out.println("El " + n+ " NO es capicúa");
        }
	}
}

/*

  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Voltea el número introducido.
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    if (volteado == numeroIntroducido) {
      System.out.println("El " + numeroIntroducido + " es capicúa");
    } else {
      System.out.println("El " + numeroIntroducido + " no es capicúa");
    }
  }
}
*/
