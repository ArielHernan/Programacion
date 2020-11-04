/*
 * tema5Ej46.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 46
    Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
    asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
    que tanto la anchura como la altura sean mayores o iguales que 2, en caso
    contrario se debe mostrar un mensaje de error.
    Ejemplo 1:
    Por favor, introduzca la anchura del rectángulo (como mínimo 2): 4
    Ahora introduzca la altura (como mínimo 2): 1
    Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altur\
    a es 2.
    Ejemplo 2:
    Por favor, introduzca la anchura del rectángulo (como mínimo 2): 6
    Ahora introduzca la altura (como mínimo 2): 4

                  * * * * * *
                  *         *
                  *         *
                  * * * * * *
 */
public class tema5Ej46 {
	
	public static void main (String args[]) {
		
    System.out.println("Introduce la altura: ");
      int altura=Integer.parseInt(System.console().readLine());
      
    System.out.println("Introduce la anchura: ");
      int anchura=Integer.parseInt(System.console().readLine()); 
      int espaciosinternos=anchura-2;
      
      for(int primeralinea=0;primeralinea<anchura;primeralinea++){
         System.out.print("* ");       
        }
        System.out.println();
        
      for(int pisos=0;pisos<altura-2;pisos++){
         System.out.print("*");
      for(int i=0;i<espaciosinternos*2+1;i++){ 
        System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
      }
     for(int ultimalinea=0;ultimalinea<anchura;ultimalinea++){
         System.out.print("* ");       
        }

	}
}

