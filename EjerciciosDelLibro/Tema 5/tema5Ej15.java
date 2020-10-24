/*
 * tema5Ej15.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
     15. Escribe un programa que dados dos números, uno real (base) y un
    * entero positivo (exponente), saque por pantalla todas las potencias
    * con base el numero dado y exponentes entre uno y el exponente introducido.
    * No se deben utilizar funciones de exponenciación. Por ejemplo, si
    * introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 2 y 2
 */
import java.util.Scanner;
public class tema5Ej15 {
	
	public static void main (String args[]) {
		
    int base=0;
    int exp=0;
    int resu=0;
  
    Scanner s=new Scanner(System.in);
    
    System.out.println("este programa te da las potencias");
    System.out.println("Introduce la base");
    base=s.nextInt();

    System.out.println("Introduce el exponente");
    exp=s.nextInt();
    
    for(int i =1;i<=exp;i++){
      resu=1;
      for(int j=1;j<i;j++){
        resu=resu*base;
        }
    System.out.println(base + "^" + i + " = " + resu);
      }
    
    
    
    
	}
}

